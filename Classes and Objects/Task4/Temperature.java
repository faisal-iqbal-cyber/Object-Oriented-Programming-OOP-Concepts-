class Temperature{

	private double ftemp;

	public void setFTemp(double f){

		ftemp=f;

	}//setFTemp

	public double getFahrenheit(){

		return ftemp;

	}//getFahrenheit()

	public double getCelsius(){
		
		return (5.0 / 9.0) * (ftemp - 32);

	}//getCelsius()

	public double getKelvin(){
		
		return ((5.0 / 9.0) * (ftemp - 32)) + 273;

	}//getKelvin()







}//class