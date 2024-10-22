class CheckingAccount extends BankAccount{
	private double insufficientFundsFee;

	CheckingAccount(){
		super();
		setFunds(1300);
	}
	CheckingAccount(double F,int n,String owner,double b){
		super(n,owner,b);
		setFunds(F);
	}
	public void setFunds(double f){
		insufficientFundsFee=f;

	}
	public double getFunds(){
		return insufficientFundsFee;
		
	}
	public void withdraw(double amount){
		if(insufficientFundsFee==amount){
			super.setBalance(getBalance()-amount);

			}else{

				System.out.println("Insufficient Balance");
			}
	}
	public void accountStatement(){
		super.accountStatement();
		System.out.println("The Fund Fee is : "+getFunds());
		System.out.println();
			
	}


}