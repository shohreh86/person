


package MainPackage;



public class student extends Person {

	
	
	public student(String name, String address, String phoneNumber, String email) {

		
		
		super(name, address, phoneNumber, email);

		
		// TODO Auto-generated constructor stub
}


	
	public static final int freshman = 9;

	
	
	public static final int sophmore = 10;

	
	
	public static final int junior = 11;

	
	
	public static final int senior = 12;

	
	

	
	
	public String toString() {

		
		
		return this.getClass().getName() + getname();

	}






	private String getname() {
		// TODO Auto-generated method stub
		return null;
	}

}