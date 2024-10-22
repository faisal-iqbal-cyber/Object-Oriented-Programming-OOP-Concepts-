import java.util.Scanner;

	public class P3{

		public static void main(String[] args){

			Scanner read=new Scanner(System.in);

			int l=getLength();
			int w=getWidth();
			getArea(l,w);

		}
		public static int getLength(){
			Scanner read=new Scanner(System.in);
			System.out.println("Enter the Length of a Rectangle :");
			int l=read.nextInt();
			return l;

		}
		public static int getWidth(){

			Scanner read=new Scanner(System.in);

			System.out.println("Enter the Width of a Rectangle :");
			int w=read.nextInt();
			return w;
		}
		public static void getArea(int l, int w){
			double a=l*w;
			System.out.println("The Area of a Rectangle is :"+a);
			

		}

	}


