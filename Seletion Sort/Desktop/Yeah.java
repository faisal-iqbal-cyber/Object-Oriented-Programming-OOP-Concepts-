import java.util.Scanner;

public class Yeah{

	public static void main (String[] args){

		Scanner read=new Scanner(System.in);
		
		String [] array= {"faisal2","aqsa","tom6","yeah1"};

		digitFound(array);
		
			


}//main
	public static void digitFound(String[] arr){
		String str;
		char ch;
		
		
		int length=arr.length;

		for(int i=0;i<length;i++){
			str=arr[i];
			boolean isDigit=false;
		for(int j=0;j<str.length();j++){
			ch=str.charAt(j);
			if(Character.isDigit(ch)){
				
				isDigit=true;
				
			}
		}

		if(isDigit==true){
			System.out.println(str +" has digit ");
			System.out.println();



		}else{
			System.out.print(str+" has no digit ");
			System.out.println();

		}

	}//for


	}//absoluteArray

	


}//class






		