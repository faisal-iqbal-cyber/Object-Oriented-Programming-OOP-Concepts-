public class Car{
	private String model;
	private int id;
	private int seats;
	private MusicPlayer[] mp;
	private int count;

	
	public Car(String m1,int id,int s,MusicPlayer m){
		setModel(m1);
		setID(id);
		setSeats(s);
		
		this.mp=new MusicPlayer[2];
		mp[0]=m;
		count=1; 
	}
	public void setModel(String m){
		model=m; 
	}
	public void setID(int id){
		this.id=id; 
	}
	public void setSeats(int s){
		seats=s; 
	}
	public String getModel(){
		return model; 
	}
	public int getID(){
		return id; 
	}
	public int getSeats(){
		return seats; 
	}
	public void addplayer(MusicPlayer m){
		this.mp[count]=m;
		count++;

	}
	public void display(){
		System.out.println("The Model of Car is : "+getModel());
		System.out.println("The ID of Car is : "+getID());
		System.out.println("The Seats of Car is : "+getSeats());
		for(int i=0;i<count;i++){
			this.mp[i].display();


		}

	}
}