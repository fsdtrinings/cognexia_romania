package com.abc.secureapp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class MySpringSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// responsible for user creations and providing roles to the user
		
		auth.inMemoryAuthentication().withUser("mike").password("mike123").roles("admin","employee");
		auth.inMemoryAuthentication().withUser("jenny").password("jenny123").roles("employee");
		auth.inMemoryAuthentication().withUser("min").password("min").roles("admin");
		
		System.out.println("---- user created "+auth);
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests()
		.antMatchers("/api/public/**").permitAll()
		.antMatchers("/api/admin/**").hasRole("admin")
		.antMatchers("/api/employee/**").hasRole("employee")
		
		.anyRequest()
		.authenticated()
		
		
		.and()
		.httpBasic();  // htto basic 
		
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return NoOpPasswordEncoder.getInstance(); // avoid 
	}
	

}
