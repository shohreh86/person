

package MainPackage;



public class Faculty extends Employee{

	
	private String officehours;

	
	private String rank;

	
	
	public Faculty(String name, String address, String phoneNumber, String email) {

		
		
		super(name, address, phoneNumber, email);

}


	
	
	public String getOfficehours() {

		
		
		return officehours;
}


	
	
	public void setOfficehours(String officehours) {

		
		
		this.officehours = officehours;
}


	
	
	
	public String getrank() {

		
		
		return rank;
}


	
	
	public void setrank(String rank) {

		
		
		this.rank = rank;
}


	
	
	public String toString() {

		
		return this.getClass().getName() + getname();
}
}