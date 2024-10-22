import java.util.Scanner;
	public class P1{
		public static void main(String[] args){
			Scanner read=new Scanner(System.in);
			System.out.println("Enter the String");
			String n=read.nextLine().toLowerCase();

			wordInfo(n);
		}//main
			
		public static void wordInfo(String n){
			int count=0;
			int length=n.length();
			for(int i=0;i<n.length();i++){

		char ch=n.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y'){
				count++;
			}




			}
			System.out.println("Characters  :"+length);
			System.out.println("Vowels  :"+count);








		}//wordInfo


}//class