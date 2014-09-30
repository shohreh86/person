

package MainPackage;


public class staff extends Employee {

	
	
	public staff(String name, String address, String phoneNumber, String email) {
		super(name, address, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}

	
	
	private String title;



	
	
	public String getTitle() {

		
		
		return title;
}


	
	
	public void settitle(String title) {
		this.title = title;
}
@Override


public String toString() {

	
	return this.getClass().getName() + getname();
}
}