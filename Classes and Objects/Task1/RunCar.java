public class RunCar{

	public static void main (String[] args){

		Car c1=new Car();

		c1.setyearModel(2023);

		c1.setmake("Auodi");

		c1.setspeed(50);

		System.out.println("The model of a car is :"+c1.getyearModel());

		System.out.println("The type of a car is :"+c1.getmake());

		System.out.println("Initial speed is :"+c1.getspeed());
		
		for(int i=0;i<5;i++){

			c1.accelerate();

			System.out.println("After Accelerator "+(i+1)+" The speed become : "+c1.getspeed());
		}

		for(int i=0;i<5;i++){

			c1.brake();

			System.out.println("After barke "+(i+1)+" The speed become : "+c1.getspeed());
		}
	
	

		

		
		
	}//main

}//class