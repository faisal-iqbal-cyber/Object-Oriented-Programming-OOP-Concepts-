public class RunShallowCopyArray{

	public static void main(String[] args){

		String[] color={"White","Blue","Gray"};

		//creating object

		ShallowCopyArray c1= new ShallowCopyArray(4,5,6,color);

		System.out.println("=========Array before changing=========");

		c1.print();

		System.out.println();

		System.out.println("==========Array after changing=========");  

		c1.changeColor();
		for(int i=0;i<color.length;i++){
			System.out.print(color[i]+" ");
		}
		color[2]="Pink";
		System.out.println();
		System.out.println("==========Array after changing=========");
		c1.print();
		//changes repeat in a array because its a shallow copy due to same refrence cause permanent changes in a array
		

	}//main

}//class