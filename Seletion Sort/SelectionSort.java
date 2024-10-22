import java.util.Scanner;

public class SelectionSort{

	public static void main (String[] args){

		Scanner read=new Scanner(System.in);

		int[] array={3,5,6,1,2,8,4};

		Sorting(array);
	}
	public static void Sorting(int[] arr){

		int length=arr.length;

		

		for(int i=0;i<length;i++){

			int minIndex=i;
			
		for(int j=i+1;j<length;j++){

			if(arr[j]<arr[minIndex]){

				minIndex=j;

			}//if

		}//for
			
					
			int temp=arr[minIndex];

			arr[minIndex]=arr[i];

			arr[i]=temp;

				
			
		

		System.out.print(arr[i]+" ");
		

		}//outer for


	}//Sorting



}//class