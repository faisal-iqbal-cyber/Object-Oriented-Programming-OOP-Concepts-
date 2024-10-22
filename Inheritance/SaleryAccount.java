public class SaleryAccount extends BankAccount{
	private double rate;

	public SaleryAccount(){
		super();
		setRate(12.5);
	}
	public SaleryAccount(double r,int n,String owner,double b){
		super(n,owner,b);
		setRate(r);
	}
	public void setRate(double r){
		rate=r;

	}
	public double getRate(){
		return rate;

	}
	public void accountStatement(){
		super.accountStatement();
		System.out.println("The Interest Rate of Balance is : "+getRate());
		System.out.println();
	}
	public void withdraw(double amount){
		if(super.getBalance()<amount){
			System.out.println("The Amount is Insufficient");

			}else{

				super.withdraw(amount);

				System.out.println("Withdraw amount is "+amount+"Remaining balance become : "+super.getBalance());

			}
		}

	public void depositMonthlyInterest(){
		double r1=(super.getBalance()+(super.getBalance()*getRate()/100))/12;

		System.out.println("Monthly Interest will be : "+r1);

	}

}


