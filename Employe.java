package interfaces_concept;

public class Employe implements SetterGetter {
	
	public Employe(Gender emp_gender) {
		this.emp_gender = emp_gender;
	}
	
	private String emp_name;
	private String department;
	private double emp_salary;
	private Gender emp_gender;
	@Override
	public void setData(String att1, String att2, int att3, double att4) {
		this.emp_name = att1;
		this.department = att2;
		this.emp_salary = att4;
		
		
	}
	@Override
	public void setData(String att1, int att2, double att3) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getData() {
		return "emp name : " + emp_name + "\n"
				+ "emp department : " + department + "\n"
						+ "emp salary : " + emp_salary +
						"\ngender : " + emp_gender.toString();
		
		        
	}


}
