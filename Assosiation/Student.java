class Student{
	private int id,semester,numberOfCourse;
	private String name,program;
	private Course[] course;

		public Student(int ID,int s,String n,String p){
			setID(ID);
			setsemester(s);
			setname(n);
			setprogram(p);
			this.course=new Course[3];
			int numberOfCourse=0;
		}
		public void setID(int ID){
			id=ID;

		}
		public void setsemester(int s){
			semester=s;

		}
		
		public void setname(String n){
			name=n;

		}
		public void setprogram(String p){
			program=p;

		}

		public int getID(){
			return id;

		}
		public int getsemester(){
			return semester;

		}
		
		public String getname(){
			return name;

		}
		public String getprogram(){
			return program;

		}
		public void registerCourse(Course b){

				this.course[numberOfCourse]=b;

				numberOfCourse++;

		}

		public void displayregisterOfCourse(){
			for(int i=0;i<numberOfCourse;i++){
				System.out.println("The Course Code is : "+course[i].getcourseCode());
				System.out.println("The Course title  is : "+course[i].gettitle());
				System.out.println();
			}
		}













}//class