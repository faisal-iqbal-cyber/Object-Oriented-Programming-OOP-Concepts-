public class RunBook{

	public static void main(String[] args){

		Book English=new Book();

		English.display();
		System.out.println();


		Book Math=new Book(10);

		Math.display();

		System.out.println();


		Book Physics=new Book(10,500);

		Physics.display();

		System.out.println();


		Book Urdu=new Book(10,500,1000.0);

		Urdu.display();

		System.out.println();

		Urdu.copy(Math);

		Math.display();

		System.out.println();

		System.out.println(Physics.toString());
		System.out.println();
		
		if(English.isLarger(Math)){
			System.out.println("English Book pages is greater than Math Book");
		}else{
			System.out.println("Math Book pages is greater than English Book");
		}
		












		





	}//class

}//main