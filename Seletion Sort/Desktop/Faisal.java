import java.util.Scanner;

public class Faisal{

	public static void main (String[] args){

		Scanner read=new Scanner(System.in);

		int[] array= {-2,4,-15,5,6,-9,12,2};

		
		int a=largestNumber(array);

		printArray(array,a);

}//main
	public static int largestNumber(int[] arr){
		int index=0;
		int length=arr.length;

		for(int i=0;i<length;i++){

		if(arr[index]<arr[i]){
			index=i;
		}
		}//for

		return index;

	}//absoluteArray

	public static void printArray(int[] arr,int a){

		

			System.out.println(arr[a]);

		

	}//absoluteArray


}//class






		