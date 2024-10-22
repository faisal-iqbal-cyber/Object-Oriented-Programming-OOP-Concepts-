import java.util.Scanner;

	public class P5{

		public static void main(String[] args){

			Scanner read=new Scanner(System.in);

			int[] array={1,2,3,4,5,6,7,8,9,10};

			int[] arr=reverseArray(array);
			printArray(arr);
			

		}
		public static int[] reverseArray(int[] a){
			int[] arr2=new int[a.length];
			for(int i=0;i<a.length;i++){
			arr2[i]=a[a.length-i-1];

			}
			return arr2;

		}
		public static void printArray(int[] arr){
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");

			}

		}

}

