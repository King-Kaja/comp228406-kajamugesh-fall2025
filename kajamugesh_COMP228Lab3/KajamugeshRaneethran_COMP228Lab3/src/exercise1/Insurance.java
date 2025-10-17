package exercise1;

abstract class Insurance {
	
	protected String type_of_insurance;
	protected double monthly_cost;
	
	public String getType_of_insurance() {
		return type_of_insurance;
	}
	
	public double getMonthly_cost() {
		return monthly_cost;
	}
	
	abstract public void setInsuranceCost(double cost);
	abstract public void displayInfo();	

}

class Health extends Insurance {
	
	

	public Health() {
		type_of_insurance = "Health";
	}

	@Override
	public void setInsuranceCost(double cost) {
		monthly_cost = cost;
	}

	@Override
	public void displayInfo() {
		System.out.printf("Life insurance with a monthly cost of $%.2f\n", monthly_cost);
		
	}
	
}

class Life extends Insurance {
	
	
	
	public Life() {
		type_of_insurance = "Life";
	}

	@Override
	public void setInsuranceCost(double cost) {
		monthly_cost = cost;
		
	}

	@Override
	public void displayInfo() {
		System.out.printf("Life insurance with a monthly cost of $%.2f\n", monthly_cost);
		
	}
	
}