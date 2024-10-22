class Course{

	private String title;
	private String courseCode;
	private int creditHours;

	
	public Course(String t,String c,int h){
		settitle(t);
		setcourseCode(c);
		setcreditHours(h);
	}
	public void settitle(String t){
		title=t;
	}
	public void setcourseCode(String c){
		courseCode=c;
	}
	public void setcreditHours(int h){
		creditHours=h;
	}
	public String gettitle(){
		return title;
	}
	public String getcourseCode(){
		return courseCode;
	}
	public int getcreditHours(){
		return creditHours;
	}















}//class