package p1;

public class StringExample {

	public static void main(String[] args) {
		
		
		String s1 = "Hello";
		
		s1 = s1.concat(" Romania");
		
		//System.out.println(s1);
		
		// ----------------------
		
		String s2 = "0123456789";
		
		s2 = s2.substring(5,8);
		
		//System.out.println(s2);
		
		// ------ 
		
		String s3 = "     hello romania    ";
		System.out.println(s3.length()); // 15
		s3 = s3.trim();
		System.out.println(s3.length()); // 15
		
		// -------- 
		
		char arr[] = s3.toCharArray(); 
		s3.toLowerCase();
		
		char ch = s3.charAt(8); // StringIndexofBond
		System.out.println(ch);
		// ---------------
		
		System.out.println("------ split ----");
		String s4 = "mike@gmail.com";
		String arr2[] = s4.split("@");
		
		//System.out.println(arr2[0]);
		if(arr2.length>1)
		{
			System.out.println(arr2[1]);
		}
		else
		{
			System.out.println("Invalid Email Id ");
		}
		
		
	}
}











