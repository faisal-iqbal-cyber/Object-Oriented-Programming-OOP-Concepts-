public class RunBookDescription{

	public static void main(String[] args){

		BookDescription book1=new BookDescription();
		book1.display();

		BookDescription book2=new BookDescription("Physics","Faisal","Ali",500);
		book2.display();

		
		book2.copy(book1);
		book1.display();

		System.out.println(book1.toString());
		System.out.println();

		if(book1.compare(book2)){

			System.out.println(" Book1  is same as  Book2");

		}else{
			System.out.println("Book2  is not same as  Book1");
		}
		System.out.println();

		if(book1.ispopular(book2)){

			System.out.println(" Book1  is more popular than  Book2");
			
		}else{

			System.out.println("Book2  is less popular than  Book1");
		}
	}//main

}//class