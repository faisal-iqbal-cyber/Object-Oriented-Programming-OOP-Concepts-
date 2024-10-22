import java.util.Scanner;

public class AssignmentTask2{

	public static void main (String[] args){

		Scanner read=new Scanner(System.in);

		String[] array1={"apple","orange","strawberry","grape","kiwi"};

		System.out.print("Enter the length of words");

		int length=read.nextInt();


		findWordsByLength(array1,length);

	}//main
	public static void findWordsByLength(String[] arr1,int l){

		String[] arr2=new String[arr1.length];

		for(int i=0;i<arr1.length;i++){
			if(arr1[i].length==l){
				arr2[i]=arr1[i];
			}
			System.out.print(arr2[i]+" ");

		}

	}

}
