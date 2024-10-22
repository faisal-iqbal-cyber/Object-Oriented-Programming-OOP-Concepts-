public class Manager{
	private String name;
	private double Salery;
	private Assistant[] A;
	int number_of_assistant;
	public Manager(){
		setName("Aqsa");
		setSalery(500000.0);
		this.A=new Assistant[2];
		number_of_assistant=0;
	}
	public Manager(String n,double s){
		setName(n);
		setSalery(s);
		this.A=new Assistant[2];
		number_of_assistant=0;
	}
	public void setName(String n){
		name=n;

	}
	public void setSalery(double s){
		Salery=s;

	}

	public String getName(){
		return name;

	}
	public double getSalery(){
		return Salery;

	}
	public void addAssistant(Assistant s){
		this.A[number_of_assistant]=s;
		number_of_assistant++;


	}
	public void display(){
		System.out.println("The Name of Manager is : "+getName() );
		System.out.println("The ID of Manager is : "+getSalery() );
		for(int i=0;i<number_of_assistant;i++){
			System.out.println("Assistant is :"+A[i].getName());
			System.out.println("Assistant  is :"+A[i].getId());
			System.out.println();

		
	}

}
	


}