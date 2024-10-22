import java.util.Scanner;
public class RunSubstance{
	
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);

		Substance s1=new Substance();
		System.out.println("Enter the temprature ");
		int t=read.nextInt();
		s1.setTemp(t);

		if(s1.isEthylFreezing()){

			System.out.println("Ethyl will be freezed");
		}else{
			System.out.println("Ethyl will be Boiled");
		}
		if(s1.isOxygenBoiling()){

			System.out.println("Oxygen will be Boiled");
		}else{
			System.out.println("Oxygen will be Freezed");
		}
		if(s1.isOxygenBoiling()){

			System.out.println("Water will be freeezed");
		}else{
			System.out.println("water will be Boiled");
		}



	}//main

	
}//class