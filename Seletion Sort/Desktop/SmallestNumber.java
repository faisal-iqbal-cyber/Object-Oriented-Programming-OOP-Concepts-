import java.util.Scanner;

public class SmallestNumber{

	public static void main (String[] args){

		Scanner read=new Scanner(System.in);
		System.out.println(" Enter the size of array : ");
		int size =read.nextInt();

		int[] array= new int[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter the value of index ["+i+"]= " );
			array[i]=read.nextInt();
			System.out.println();
		}//for
			System.out.println("Enter the no. you want to search :");
			int number=read.nextInt();

		
		boolean result=searchNumber(array,number);
		if(result==true){
			System.out.println("Number is Found :");
		}else{
			System.out.println("Number is not Found :");
		}

}//main
	public static boolean searchNumber(int[] arr,int n){

		boolean isFound=false;
		int length=arr.length;

		for(int i=0;i<length;i++){

		if(arr[i]==n){
			isFound=true;
			
		}//if

	}//for

		return isFound;

	}//absoluteArray

	


}//class






		