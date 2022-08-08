package p1;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String houseNumber;
	private String city;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseNumber, String city, String country) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
		this.country = country;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
