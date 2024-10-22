public class BankAccount{
	private int number;
	private String owner;
	private double balance;

	public BankAccount(){
		setNumber(3095);
		setOwner("Faisal");
		setBalance(120000.8);
	}

	public BankAccount(int n,String owner,double b ){
		setNumber(n);
		setOwner(owner);
		setBalance(b);
	}
	public void setNumber(int n){
		number=n;
	}
	public void setOwner(String o){
		owner=o;
	}
	public void setBalance(double b){
		balance=b;
	}

	public int getNumber(){
		return number;
	}
	public String getOwner(){
		return owner;
	}
	public double getBalance(){
		return balance;
	}

	public void accountStatement(){
		System.out.println("The number Of Owner is : "+getNumber());
		System.out.println("The Name Of Owner is : "+getOwner());
		System.out.println("The Balance Of Owner is : "+getBalance());
		System.out.println();

	}

	public void deposit(double amount){
		this.balance+=amount;
	}
	public void withdraw(double amount){
		this.balance-=amount;
	}




}//class