package interfaces_concept;

public class Student implements SetterGetter{
	
	private int st_age;
	private String name;
	private String lastname;
	private double grade ;
	@Override
	public void setData(String att1, String att2, int att3, double att4) {
		
		this.name = att1;
		this.lastname = att2;
		this.st_age = att3;
		this.grade = att4;
		
	}
	@Override
	public void setData(String att1, int att2, double att3) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getData() {

		return "st_name : " + name + "\n" +
				"st_lastname : " + lastname + "\n" +
				"st age : " + st_age + "\n" +
				"grade : " + grade;
		
		
	}

}
