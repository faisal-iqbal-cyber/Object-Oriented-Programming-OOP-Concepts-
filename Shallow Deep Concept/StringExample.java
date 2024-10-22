class StringExample {
	
	public static void main(String[] args) {
		String s = "GIFT";

		String t = "GIFT";

                // Check the reference equality
		System.out.println(s == t);
                //Check the content equality
		System.out.println(s.equals(t));

		String u = s;

		System.out.println(s == u);

		String v = new String("GIFT");

		System.out.println(s == v);
		System.out.println(s.equals(v));


	}//main


}//class