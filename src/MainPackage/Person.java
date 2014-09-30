

package MainPackage;

public class Person {

	
	private String name;

	
	private String address;

	private String phone;

	private String Email;

	public Person(String name, String address, String phone, String email) {


		this.name = name;

		this.address = address;

		this.phone = phone;

		this.Email = email;
}


	public void setName(String name) {

		this.name = name;
}


	
	public String getadd() {

		
		return address;
}


	
	
	public void setaddress(String address) {

		
		this.address = address;
}


	
	
	public String getphone() {

		
		return phone;
}


	
	
	public void setphone(String phoneNumber) {

		
		this.phone = phoneNumber;
}


	
	
	public String getEmail() {

		
		return Email;
}

	
	

	
	
	public void setEmail(String email) {

		
		
		this.Email = email;
}


	
	public String toString() {

		
		
		return this.getClass().getName() + name;
}
}