import java.util.Scanner;

public class Practice{

	public static void main (String[] args){

		Scanner read=new Scanner(System.in);

		int[] array= {-2,4,-15,5,6,-9,12,2};

		
		int[] a=absoluteArray(array);
		printArray(a);

}//main
	public static int[] absoluteArray(int[] arr){

		int length=arr.length;

		for(int i=0;i<length;i++){

			arr[i]=(int)Math.abs(arr[i]);
		}//for
		return arr;

	}//absoluteArray
	public static void printArray(int[] a){

		int length=a.length;

		for(int i=0;i<length;i++){

			System.out.print(a[i]+" ");

		}//for

	}//absoluteArray


}//class






		