import java.util.Scanner;
public class Binary{
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		int[] array={23,45,67,87,96,99};
		System.out.println("Please enter the number you want to search:");
		int key=read.nextInt();

		int index=binary(array,key);
		if(index==1){
		System.out.println("Key not found");
		
		}else{
		System.out.println("Index of a key is :"+index);
		}
		
		
	}//main

	public static int binary(int[] a,int key){
		boolean found=false;
		int low=0;
		int high=a.length-1;
		int position=-1;
		int mid;
		while(low<=high && !found){
			mid=(low+high)/2;
			if(a[mid]==key){
				position=mid;
			return position;
			}else if(a[mid]>key){
				high=mid-1;
			}else{
				low=mid+1;
			}
			}
			return position;
		}
	}

