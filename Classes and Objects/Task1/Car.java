class Car{

	private int yearModel;

	private String make;

	private int speed;


		public void setyearModel(int Model){
			yearModel=Model;

		}
		public void setmake(String MAKE){
			make=MAKE;

		}
		public void setspeed(int Speed){
			speed=Speed;
		}


		public int getyearModel(){
			return yearModel;

		}
		public String getmake(){
			return make;

		}
		public int getspeed(){
			return speed;

		}

		public void accelerate(){
			speed+=5;
		}//accelerate

		public void brake(){
			speed-=5;
			if(speed<0){
				speed=0;
			}//if

		}//brake

		


}//Car