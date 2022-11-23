

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter employee name");
		
		String outputName = myScanner.nextLine();
		
		System.out.println("Please enter the hourly rate (in dollars) of " + outputName);
		
		double outputHourlyRate = myScanner.nextDouble();
		
		System.out.println("Please enter the number of hours worked by " + outputName);
		
		double outputHours = myScanner.nextDouble();
		
		PaymentSlip paymentSlip1 = new PaymentSlip(outputName, outputHourlyRate, outputHours);
		
		double outputSalaryBeforeTax = paymentSlip1.CalculateSalary();
		double outputSalaryAfterTax = paymentSlip1.CalculateNetSalary();
		
		
		System.out.println("--------------------" + "\n" + "\n" + "## PAYMENT INFORMATION ##" + 
		"\n" + "\n" + "Name:" + "\t" + "\t" + "\t" + paymentSlip1.getName() + "\n" + 
		"Hourly rate:" + "\t" + "\t" + "$" + paymentSlip1.getHourlyRate() + "\n" + 
		"Hours worked:" + "\t" + "\t" + paymentSlip1.getHours() + "\n" + "\n" + 
		"Salary before tax:" + "\t" + "$" + outputSalaryBeforeTax + "\n" + 
		"Salary after tax:" + "\t" + "$" + outputSalaryAfterTax + "\n" + "\n" + 
		"If you have any questions regarding your salary, contact Bob" + "\n" +
		"--------------------");
	}
	


}
