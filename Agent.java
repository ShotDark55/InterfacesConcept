package interfaces_concept;

public class Agent implements SetterGetter{
	
	private int ID;
	private String agent_name;
	private double agent_salary;
	@Override
	public void setData(String att1, String att2, int att3, double att4) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setData(String att1, int att2, double att3) {
		this.agent_name = att1;
		this.agent_salary = att3;
		this.ID = att2;
		
	}
	@Override
	public String getData() {
		
		return "agent name : " + agent_name + "\n"
				+"agent salary : " + agent_salary +"\n"
				+"ID : " + ID;
	}
	
	

}
