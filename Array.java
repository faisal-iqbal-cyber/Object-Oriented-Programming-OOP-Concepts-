import java.util.Scanner;

	public class Array{

		public static void main(String[] args){

			Scanner read=new Scanner(System.in);

			int[][] arr1={{1,2,3,4},{3,4,5,6},{6,7,8,9},{11,13,14,16}};

			printArray(arr1);
			System.out.println();

			double[] a= RowAverage(arr1);

			for(int i=0;i<a.length;i++){

				System.out.print("\t"+a[i]+"");


			}//for
			System.out.println();

			double b= highestAverageR(arr1);


				System.out.print("Highest average will be : "+b+"\n");

			double[] d= ColomnAverage(arr1);

			for(int i=0;i<a.length;i++){

				System.out.print("\t"+d[i]+"");


			}//for
			System.out.println();

			double c= highestAverageC(arr1);


				System.out.println("Highest average will be : "+c+"\n");

				System.out.println();

				double r=DiagnolAverage(arr1);
				System.out.println("The average of diagnol will be :"+r);
			System.out.println();
			swapRow(arr1);
			System.out.println("Swapping of Row");

			printArray(arr1);

			System.out.println();

			System.out.println("Swapping of Column");

			swapColoumn(arr1);

			printArray(arr1);

			System.out.println();






		}//main

		public static void printArray(int[][] a){

			for(int i=0;i<a.length;i++){

				for(int j=0;j<a[0].length;j++){

					System.out.print("\t"+a[i][j]+"  ");

				}//for

				System.out.println();

			}//for

		}//printArray

		public static double[] RowAverage(int[][] a){
			int sum=0;
			double[] av=new double[a.length];
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					sum+=a[i][j];


				}
				double average=(double)sum/a[i].length;
					av[i]= average;
					sum=0;
				}

				return av;


			

			

		}//printArray

		public static double highestAverageR(int[][] a){
			int sum=0;
			double highest=0.0;
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					sum+=a[i][j];


				}
				double average=(double)sum/a[i].length;
					if(average>highest){
						highest=average;
					}
					sum=0;
				}

				return highest;


			

			

		}//printArray

		public static double[] ColomnAverage(int[][] a){
			int sum=0;
			double[] av=new double[a.length];
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					sum+=a[j][i];


				}
				double average=(double)sum/a[i].length;
					av[i]= average;
					sum=0;
				}

				return av;


			

			

		}//printArray

		public static double highestAverageC(int[][] a){
			int sum=0;
			double highest=0.0;
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					sum+=a[j][i];


				}
				double average=(double)sum/a[i].length;
					if(average>highest){
						highest=average;
					}
					sum=0;
				}

				return highest;


			

			

		}//printArray

		public static double DiagnolAverage(int[][] a){
			int sum=0;
			double average=0.0;
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					if(i==j){


						sum+=a[i][j];
					}

				}

				average=(double)sum/a[i].length;
					
			}

				return average;


			

			

		}//printArray

		public static void swapRow(int[][] a){
			for(int i=0;i<a.length;i++){
					int temp=a[0][i];
					a[0][i]=a[a.length-2][i];
					a[a.length-2][i]=temp;

			}

		

			
		}

		public static void swapColoumn(int[][] a){
			for(int i=0;i<a.length;i++){
					int temp=a[i][0];
					a[i][0]=a[i][a[0].length-2];
					a[i][a[0].length-2]=temp;

			}

		

			
		}




	}//class 