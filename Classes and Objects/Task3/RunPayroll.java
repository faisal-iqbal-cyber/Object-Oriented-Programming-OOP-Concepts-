import java.util.Scanner;
public class RunPayroll{

	public static void main(String[] args){

		Scanner read=new Scanner(System.in);

		System.out.println("Detail of Employee 1");

		System.out.print("Enter the name of a Employee 1 :");
		String name1=read.nextLine();

		System.out.print("Enter the ID of a Employee 1 :");
		int idNumber1=read.nextInt();

		System.out.print("Enter hourly pay rate of a Employee 1 :");
		double hourlyPayRate1=read.nextDouble();

		System.out.print("Enter No. of hours of a Employee 1 : ");
		double numberOfHoursWorked1=read.nextDouble();

		System.out.println();


		read.nextLine();
		System.out.println("\nDetail of Employee 2");

		System.out.print("Enter the name of a Employee 2: ");
		String name2=read.nextLine();

		System.out.print("Enter the ID of a Employee 2: ");
		int idNumber2=read.nextInt();

		System.out.print("Enter hourly pay rate of a Employee 2: ");
		double hourlyPayRate2=read.nextDouble();

		System.out.print("Enter No. of hours of a Employee 2: ");
		double numberOfHoursWorked2=read.nextDouble();

		System.out.println();


		read.nextLine();

		System.out.println("\nDetail of Employee 3");

		System.out.print("Enter the name of a Employee 3: ");
		String name3=read.nextLine();

		System.out.print("Enter the ID of a Employee 3: ");
		int idNumber3=read.nextInt();

		System.out.print("Enter hourly pay rate of a Employee 3: ");
		double hourlyPayRate3=read.nextDouble();

		System.out.print("Enter No. of hours of a Employee 3: ");
		double numberOfHoursWorked3=read.nextDouble();


		Payroll e1=new Payroll(name1,idNumber1,hourlyPayRate1,numberOfHoursWorked1);

		Payroll e2=new Payroll(name2,idNumber2,hourlyPayRate2,numberOfHoursWorked2);

		Payroll e3=new Payroll(name3,idNumber3,hourlyPayRate3,numberOfHoursWorked3);
		
		System.out.println();
		System.out.println("The Gross Pay of Employee 1 is : "+e1.calculateGrossPay());
		System.out.println("The Gross Pay of Employee 2 is : "+e2.calculateGrossPay());
		System.out.println("The Gross Pay of Employee 3 is : "+e3.calculateGrossPay());

		
		





	}//main

}//class