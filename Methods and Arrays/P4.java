import java.util.Scanner;

	public class P4{

		public static void main(String[] args){

			Scanner read=new Scanner(System.in);

			int[] array={1,2,3,4,5,6,7,8,9,10};

			int[] arr=swapArray(array);
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}

		}
		public static int[] swapArray(int[] a){
			int temp=a[0];
			for(int i=0;i<a.length-1;i++){
				a[i]=a[i+1];
				


			}
			a[a.length-1]=temp;
			return a;

		}

}
