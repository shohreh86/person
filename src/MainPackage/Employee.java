


package MainPackage;



import java.util.Date;




public class Employee extends Person{

	
	public Employee(String name, String address, String phoneNumber,String email) {

		
		super(name, address, phoneNumber, email);

}

	
	

	


	
	
	
	private String office;

	
	
	private String salary;

	
	
	private Date datehired = new java.util.Date();


	
	
	public String getOffice() {

		
		return office;
}


	
	
	
	public void setOffice(String office) {


		this.office = office;
}

	


	
	public String getsalary() {

		
		return salary;
}


	
	
	public void setsalary(String salary) {

		
		this.salary = salary;
}


	
	
	public Date getDatehired() {

		return datehired;
}


	
	
	public void setdatehired(Date dateHired) {

		
		this.datehired = dateHired;
}


	
	
	public String toString() {

		
		return this.getClass().getName() + getname();
	}





	protected String getname() {
		// TODO Auto-generated method stub
		return null;
	}
}










