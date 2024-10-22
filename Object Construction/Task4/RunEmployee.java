public class RunEmployee{

	public static void main(String[] args){

		Employee e1=new Employee();
		e1.display();
		System.out.println();

		Employee e2=new Employee("Faisal",221370186,"Computer Science","HOD");
		e2.display();
		System.out.println();

		
		e2.copy(e1);
		e1.display();

		System.out.println(e1.toString());
		System.out.println();

		if(e1.compare(e2)){

			System.out.println(" Employee1 has same state values as Employee2");

		}else{
			System.out.println("Employee1 has diffirent state values as Employee2");
		}
		System.out.println();

		
	}//main

}//class