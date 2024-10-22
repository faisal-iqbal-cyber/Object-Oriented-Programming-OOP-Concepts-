class Employee{
	private String name;
	private int idNumber;
	private String department;
	private String position;

public Employee(){
		this.setname("null");
		this.setidNumber(0);
		this.setdepartment("null");
		this.setposition("null");

	}
	public Employee(String n,int id,String dp,String p){
		this.setname(n);
		this.setidNumber(id);
		this.setdepartment(dp);
		this.setposition(p);

	}
	public void setname(String n){

		name=n;

	}//setsetId

	public void setidNumber(int a){

		idNumber=a;

	}//setpages

	public void setdepartment(String A){

		 department=A;

	}//setPrice
	public void setposition(String A){

		position=A;

	}//setPrice



	public String getname(){

		return name;

	}//setsetId

	public int getidNumber(){

		return idNumber;

	}//setpages

	public String getdepartment(){

		return  department;

	}//setPrice
	public String getposition(){

		return position;

	}//setPrice
	public void copy(Employee b){

		b.setname(this.getname());

		b.setidNumber(this.getidNumber());

		b.setdepartment(this.getdepartment());

		b.setposition(this.getposition());
		

	}//copy
	public String toString(){

		return this.getname() +","+ this.getidNumber() + ","+ this.getdepartment()+","+getposition();

	}//toString
	public boolean compare(Employee b){

			return (this.getname().equals(b.getname()) && this.getidNumber()==b.getidNumber() && this.getdepartment().equals(b.getdepartment()) &&this.getposition().equals(b.getposition()));
		

	}
	public void display(){

		System.out.println("The name of Employee is :"+getname());

		System.out.println("The  id of employee is :"+getidNumber());

		System.out.println("The Department of Employee  is :"+getdepartment());

		System.out.println("The positionm of of a Employee is :"+getposition());
		
	}//display()

}//class