class MusicPlayer{
	private String name;
	private double price;

	public MusicPlayer(){
		setName("Audionic");
		setPrice(12000.8);
	}

	public MusicPlayer(String n,double p){
		setName(n);
		setPrice(p);
	}
	public void setName(String n){
		name=n;

	}
	public void setPrice(double p){
		price=p;

	}

	public String getName(){
		return name;

	}
	public double getPrice(){
		return price;

	}
	public void display(){
		System.out.println("The Name of Music Player is : "+getName());
		System.out.println("The Price of Music Player is : "+getPrice());
		System.out.println();
		

	}
}