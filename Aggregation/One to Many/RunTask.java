public class RunTask{
	
	public static void main(String[] args) {
		
		MusicPlayer mp1=new MusicPlayer();

		MusicPlayer mp2=new MusicPlayer("Hear Me",17000.7);

		MusicPlayer mp3=new MusicPlayer("Ear Loving",5000.5);



		Car c1= new Car("Ferrari",111,2,mp3);

		c1.display();

		c1.addplayer(mp2);

		c1.display();

		


	}
}