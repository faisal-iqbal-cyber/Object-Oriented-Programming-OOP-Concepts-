public class RunTask{

	public static void main(String[] args){

		BankAccount b1=new BankAccount();

		BankAccount b2=new BankAccount(2372,"Saqib",50000);

		SaleryAccount s1=new SaleryAccount();

		SaleryAccount s2=new SaleryAccount(23.5,1117,"Aqsa",80000);

		CheckingAccount c1= new CheckingAccount();

		CheckingAccount c2= new CheckingAccount(12000.9,1114,"Milli",40000);

		b2.accountStatement();

		s2.accountStatement();

		c2.accountStatement();

		c2.deposit(12000.0);

		c2.withdraw(520.0);

		c2.accountStatement();







	}
}