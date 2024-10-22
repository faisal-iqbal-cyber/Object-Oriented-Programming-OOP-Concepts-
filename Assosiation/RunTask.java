public class RunTask{
	public static void main(String[] args){

		Assistant a1=new Assistant();

		Assistant a2=new Assistant("Ayaan",100);

		Assistant a3=new Assistant("NOMAN",00);


		Manager m1= new Manager();

		Manager m2= new Manager("Rabii",7000.8);

		Manager m3= new Manager("Seerat",5475.8);



		a1.addManager(m1);

		a3.addManager(m2);

		a2.addManager(m2);

		a3.addManager(m3);

		


		a1.display();

		a2.display();

		a3.display();

		

		m1.display();



	}
}