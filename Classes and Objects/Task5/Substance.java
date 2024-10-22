class Substance{
	private int Ethyl_Alcohal_BP=172;
	private int Ethyl_Alcohal_FP=-173;
	private int Oxygen_BP=-306;
	private int Oxygen_FP=-362;
	private int Water_BP=212;
	private int Water_FP=-32;
	private int Temp;

	public void setTemp(int t){
			Temp=t;

	}//setTemp
	public boolean isEthylFreezing(){

		if(Temp<Ethyl_Alcohal_BP){

			return true;

		}else{

			return false;

		}//else

	}//isEthylFreezing
	

	public boolean isOxygenBoiling(){

		if(Temp<Oxygen_FP){

			return true;

		}else{

			return false;

		}//else

	}//isEthylFreezing
	
	public boolean isWaterFreezing(){

		if(Temp<Water_BP){

			return true;

		}else{

			return false;

		}//else

	}//isEthylFreezing
	
	











}//Substance