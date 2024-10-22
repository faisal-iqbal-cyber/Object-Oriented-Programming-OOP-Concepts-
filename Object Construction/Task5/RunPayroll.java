public class RunPayroll{
	public static void main(String[] args) {
		Payroll p1=new Payroll();
		p1.display();

		Payroll p2=new Payroll("Saqib",221370198,12.3,34.0);
		p2.display();

		Payroll p3=new Payroll();
		p2.copy(p3);
		
		System.out.println(p2.toString());

		System.out.println("The gross pay is :"+p2.grossPay());

		if(p2.iscompare(p3)){
			System.out.println("They have same properties");

		}else{
			System.out.println("They have different properties");
		}





	}
}