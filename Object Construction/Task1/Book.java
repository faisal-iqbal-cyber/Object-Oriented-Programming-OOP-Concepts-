class Book{

	private int bookId;

	private int pages;

	private double price;

	public Book(){

		this.setsetId(0);
		this.setpages(0);
		this.setPrice(0.0);

	}//Book()

	public Book(int id){

		this.setsetId(id);

	}//Book

	public Book(int id, int pages){

		this.setsetId(id);
		this.setpages(pages);

	}//Book

	public Book(int id, int pages,double p){

		this.setsetId(id);
		this.setpages(pages);
		this.setPrice(p);

	}//Book

	public void setsetId(int id){

		bookId=id;

	}//setsetId

	public void setpages(int pg){

		pages=pg;

	}//setpages

	public void setPrice(double pr){

		price=pr;

	}//setPrice

	public int getsetId(){

		return bookId;

	}//getsetId

	public int getpages(){

		return pages;

	}//getpages

	public double getPrice(){

		return price;

	}//getPrice

	public void display(){

		System.out.println("The ID of a Book is :"+getsetId());

		System.out.println("The Pages of a Book is :"+getpages());

		System.out.println("The Price of a Book is :"+getPrice());
		
	}//display()

	public void copy(Book b){

		b.setsetId(this.getsetId());

		b.setpages(this.getpages());

		b.setPrice(this.getPrice());

	}//copy
	public String toString(){

		return this.getsetId()+","+this.getpages()+","+this.getPrice();

	}//toString

	public boolean isLarger(Book b){

		return this.getpages()>b.getpages();

	}//isLarger

	public	boolean isExpensive(Book b){

		return (this.getPrice()-b.getPrice())>0.0001;

	}//isExpensive
	



}//class