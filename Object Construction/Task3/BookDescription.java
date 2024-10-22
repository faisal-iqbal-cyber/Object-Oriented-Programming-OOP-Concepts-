class BookDescription {
	private String title;
	private String author;
	private String publisher;
	private int copiesSold;


	public BookDescription(){
		this.setTitle("null");
		this.setAuthor("null");
		this.setPublisher("null");
		this.setCopiesSold(0);

	}
	public BookDescription(String t,String a,String pb,int cs){
		this.setTitle(t);
		this.setAuthor(a);
		this.setPublisher(pb);
		this.setCopiesSold(cs);

	}
	public void setTitle(String n){

		title=n;

	}//setsetId

	public void setAuthor(String a){

		author=a;

	}//setpages

	public void setPublisher(String A){

		 publisher=A;

	}//setPrice
	public void setCopiesSold(int A){

		 copiesSold=A;

	}//setPrice



	public String getTitle(){

		return title;

	}//setsetId

	public String getAuthor(){

		return author;

	}//setpages

	public String getPublisher(){

		 return publisher;

	}//setPrice
	public int getCopiesSold(){

		 return copiesSold;

	}//setPrice
	public void copy(BookDescription b){

		b.setTitle(this.getTitle());

		b.setAuthor(this.getAuthor());

		b.setPublisher(this.getPublisher());

		b.setCopiesSold(this.getCopiesSold());
		

	}//copy
	public String toString(){

		return this.getTitle()+","+this.getAuthor()+","+this.getPublisher()+","+getCopiesSold();

	}//toString
	public boolean compare(BookDescription b){

			return (this.getTitle().equals(b.getTitle()) && this.getAuthor().equals(b.getAuthor()) && this.getPublisher().equals(b.getPublisher()) &&this.getCopiesSold()==b.getCopiesSold());
		}
		public void display(){

		System.out.println("The Title of a Book is :"+getTitle());

		System.out.println("The  of a Author is :"+getAuthor());

		System.out.println("The Publisher of a Book is :"+getPublisher());

		System.out.println("The CopiesSold of a Book is :"+getCopiesSold());
		
	}//display()

	public boolean ispopular(BookDescription b){
		if(this.getCopiesSold()>b.getCopiesSold()){
			return true;
		}else{
			return false;
		}


	}//ispopular

		
}	

	