public class RunClass{

	public static void main (String[] args){

		Course c1=new Course("OOP","CS_239",3);

		Course c2=new Course("DLD","D_239",2);

		Course c3=new Course("Math","M_239",1);

		Student s1=new Student(121,2,"Faisal","BS CS");

		Student s2=new Student(189,3,"Laiba","BS English");

		s1.registerCourse(c1);

		s2.registerCourse(c2);

		s1.registerCourse(c3);

		System.out.println("\tCourse Details of Student");
		
		s2.displayregisterOfCourse();

		s1.displayregisterOfCourse();
















	}
}