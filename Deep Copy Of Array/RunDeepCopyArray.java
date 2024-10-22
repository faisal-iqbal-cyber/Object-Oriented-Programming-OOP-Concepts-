public class RunDeepCopyArray{

	public static void main(String[] args){

		String[] color={"Orange","Golden","Silver"};

		//creating object

		DeepCopyArray c1= new DeepCopyArray(4,5,6,color);

		System.out.println("=========Array before changing=========");

		c1.print();

		System.out.println();

		System.out.println("==========Array after changing=========");  

		c1.changeColor();

		for(int i=0;i<color.length;i++){// no effect on array
			System.out.print(color[i]+" ");// having no effect on array
		}
		System.out.println();

		c1.print();//print changed values

		System.out.println();

		color[2]="Pink";

		for(int i=0;i<color.length;i++){//having effect

			System.out.print(color[i]+" ");//having effect

		}
		System.out.println();

		System.out.println("==========Array after changing=========");

		c1.print();//here pink color not repeated only change temporary at above

		//in a deep copy changes are temporary changing not repeated parmenent because its deep copy 

		

	}//main

}//class