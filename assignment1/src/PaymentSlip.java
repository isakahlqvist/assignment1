
public class PaymentSlip {
	private String name;
	private double hourlyRate;
	private double hours;
	
	public PaymentSlip() {
	}
	
	public PaymentSlip(String name, double hourlyRate, double hours) {
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHourlyRate() {
		return this.hourlyRate;
	}
	
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double getHours() {
		return this.hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	public double CalculateSalary() {
		return this.hourlyRate * this.hours;
	}
	
	private final double TAXRATE = 0.3;
	
	public double CalculateNetSalary() {
		return this.hourlyRate * this.hours * (1 - TAXRATE);
	}
	

}