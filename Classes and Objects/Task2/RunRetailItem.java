public class RunRetailItem{

	public static void main (String[] args){

		RetailItem r1=new RetailItem("Jacket",12,59.95);

		RetailItem r2=new RetailItem("Jeans",40,34.95);

		RetailItem r3=new RetailItem("Shirt",20,24.95);
		

		System.out.println("Description"+" \t\t"+"UnitsOnHand"+" \t"+"Price");
		
		r1.display();

		r2.display();

		r3.display();


	}//main


}//class