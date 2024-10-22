class Payroll{

	private String name;

	private int idNumber;

	private double HourlyPayRate;

	private double numberOfHoursWorked;

	public Payroll(){

		setName("Faisal");
		setidNumber(221370186);
		setPayRate(18.5);
		setHours(24.0);

	}//Payroll
	public Payroll(String n,int id,double rate,double h){

		setName(n);
		setidNumber(id);
		setPayRate(rate);
		setHours(h);

	}//Payroll

	public void display(){

		System.out.println("The name is : "+getName());

		System.out.println("The id is : "+getidNumber());

		System.out.println("The pay rate  is : "+getPayRate());

		System.out.println("The no. of hours is : "+getHours());

	}//display
	public void setName(String n){
		name=n;

	}
	public void setidNumber(int id){
		idNumber=id;
		
	}
	public void setPayRate(double rate){
		HourlyPayRate=rate;
		
	}
	public void setHours(double h){
		numberOfHoursWorked=h;
		
	}


	public String getName(){
		return name;

	}
	public int getidNumber(){
		return idNumber;
		
	}
	public double getPayRate(){
		return HourlyPayRate;
		
	}
	public double getHours(){
		return numberOfHoursWorked;
		
	}
	public void copy(Payroll b){
		b.setName(this.getName());
		b.setidNumber(this.getidNumber());
		b.setPayRate(this.getPayRate());
		b.setHours(this.getHours());

	}
	public String toString(){

		return ("name is "+getName()+" "+"id number is"+getidNumber()+" "+"pay rate is "+getPayRate()+" "+" number of hours"+getHours());
	}
	public double grossPay(){

		return getPayRate()*getHours();
	}
	public boolean iscompare(Payroll p){

		return (this.getName().equals(p.getName()) && this.getidNumber()== p.getidNumber() && this.getPayRate()== p.getPayRate() && this.getHours()== p.getHours());
	}

}//class