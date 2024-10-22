public class Assistant{
	private String name;
	private int id;
	private Manager[] m;
	int number_of_Manager;

	public Assistant(){

		setName("Faisal");
		setId(221370186);
		this.m=new Manager[2];
		number_of_Manager=0;


	}
	public Assistant(String n,int id){
		setName(n);
		setId(id);
		this.m=new Manager[2];
		number_of_Manager=0;

		
	}
	public void setName(String n){
		name=n;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}

	public void addManager(Manager m1){

		this.m[number_of_Manager]=m1;

		number_of_Manager++;
		m1.addAssistant(this);

	}
	public void display(){
		System.out.println("The Name of Assistant is : "+getName() );
		System.out.println("The ID of Assistant is : "+getId() );
		for(int i=0;i<number_of_Manager;i++){
			System.out.println("Manager Name is :"+m[i].getName());
			System.out.println("Manager Salery is :"+m[i].getSalery());
			System.out.println();

		}

	}
	

}//class