import java.util.Scanner;

	public class P2{

		public static void main(String[] args){

			Scanner read=new Scanner(System.in);

			System.out.println("Enter the String");

			String n=read.nextLine();

			System.out.println("Enter the Position ");

			int p=read.nextInt();

			while(p<0){

				System.out.println("Enter the Position again ");

			p=read.nextInt();

			}



			char ch=charAtPosition(n,p);
			System.out.println("Character at position is :"+ ch);


		}//main

		public static char charAtPosition(String n,int p){

			int length=n.length();
			char c=n.charAt(p);

			return c;

		}//charAtPosition

}//class


