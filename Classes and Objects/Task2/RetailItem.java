class RetailItem{

	private String description;

	private int unitsOnHand;

	private double price;

	public  RetailItem(String des,int units,double pr){

		description=des;

		unitsOnHand=units;

		price=pr;

	}//RetailItem

	public void setDescription(String description) {

        this.description = description;
    }

	public String getdescription(){

		return description;

	}//getdescription()

	public void setUnitsOnHand(int unitsOnHand) {

        this.unitsOnHand = unitsOnHand;
    }


	public int getunitsOnHand(){

		return unitsOnHand;
		
	}//getunitsOnHand()

	public void setPrice(double price) {

        this.price = price;
    }

	public double getprice(){

		return price;
		
	}//getprice()

	public void display(){

		System.out.println(getdescription()+"\t\t\t "+getunitsOnHand()+" \t\t"+getprice());

	}//display()

	


}//class