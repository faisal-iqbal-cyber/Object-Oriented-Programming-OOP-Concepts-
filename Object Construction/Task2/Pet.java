class Pet{

	private String name;

	private String animal;

	private int age;

	public Pet(){
		this.setname("null");
		this.setanimal("null");
		this.setage(0);
	}
	public Pet(String a){
		this.setname(a);
		
	}
	public Pet(String a,String b){
		this.setname(a);
		this.setanimal(b);
		
	}
	public Pet(String a,String b,int ag){
		this.setname(a);
		this.setanimal(b);
		this.setage(ag);
	}
	public void setname(String n){

		name=n;

	}//setsetId

	public void setanimal(String a){

		animal=a;

	}//setpages

	public void setAge(int A){

		 age=A;

	}//setPrice

	public int getname(){

		return name;

	}//getsetId

	public int getanimal(){

		return animal;

	}//getpages

	public double getage(){

		return age;

	}//getPrice
	public void display(){
		public void display(){

		System.out.println("The name of a Pet is :"+getsetId());

		System.out.println("The Pages of a Book is :"+getpages());

		System.out.println("The Price of a Book is :"+getPrice());
		
	}//display()
	}
	public void copy(Pet b){

		b.setname(this.getname());

		b.setanimal(this.getanimal());

		b.setAge(this.getage());

	}//copy







}//Pet