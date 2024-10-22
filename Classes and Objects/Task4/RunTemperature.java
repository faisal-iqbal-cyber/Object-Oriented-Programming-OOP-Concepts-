import java.util.Scanner;

public class RunTemperature{

	public static void main(String[] args){

		Scanner read=new Scanner(System.in);

		System.out.print("Enter the temprature in fahrenite : ");

		double temp=read.nextDouble();

		Temperature t1=new Temperature();

		t1.setFTemp(temp);

		System.out.println("The temprature in fahrenite is : "+t1.getFahrenheit());

		System.out.println("The temprature in Celsius is : "+t1.getCelsius());

		System.out.println("The temprature in Kelvin is : "+t1.getKelvin());




	}//main

}//class