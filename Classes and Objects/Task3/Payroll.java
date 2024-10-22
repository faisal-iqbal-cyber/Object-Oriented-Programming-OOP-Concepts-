
class Payroll{
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double numberOfHoursWorked;
	public Payroll(String name, int idNumber, double hourlyPayRate, double numberOfHoursWorked) {
        this.name = name;
        this.idNumber = idNumber;
        this.hourlyPayRate = hourlyPayRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
	

	
	public double calculateGrossPay() {
        return hourlyPayRate * numberOfHoursWorked;
    }
	
}//Payroll