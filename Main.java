package interfaces_concept;

public class Main {

		

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setData("oussama", "salmi", 24, 80.5D);
		
		System.out.println(student1.getData());
		
		
		Employe employe1 = new Employe(Gender.female);
		employe1.setData("mina", "tetecher",0,3000001.01D );
		
		
		System.out.println(employe1.getData());
		
		
		Agent agent = new Agent();
		
		agent.setData("tayab", 001, 150);
		System.out.println(agent.getData());
		
	}
	
	}
		

	
	

		
		
		
		

		
		

		
		
		

		
		
				

	
	
	


	
	
	
