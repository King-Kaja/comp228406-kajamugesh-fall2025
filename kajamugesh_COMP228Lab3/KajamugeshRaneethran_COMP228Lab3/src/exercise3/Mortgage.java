package exercise3;

abstract class Mortgage {
	protected String term;
	protected int number;
	protected String name;
	protected double amount;
	protected int interest_rate;
	
	
	public Mortgage(String term, int number, String name, double amount, int interest_rate) {
		this.term = term;
		this.number = number;
		this.name = name;
		this.amount = amount;
		this.interest_rate = interest_rate;
	}
	
	public void getMortgageInfo(){
		System.out.printf("This is a %s term mortgage with the number %d belonging to %s with the amount $%.2f at an interest rate of %d%%\n",
				term, number, name, amount, interest_rate);
	}
	
	
}

interface MortgageConstants{
	public final int SHORT = 1;
	public final int MEDIUM = 3;
	public final int LONG = 5;
	public final String BANK_NAME = "CityToronto";
}

class BusinessMortgage extends Mortgage implements MortgageConstants{

	public BusinessMortgage(String term, int number, String name, double amount, int interest_rate) {
		super(term, number, name, amount, interest_rate);
		this.interest_rate = this.interest_rate +1;	
		
	}
	
}

class PersonalMortgage extends Mortgage implements MortgageConstants{

	public PersonalMortgage(String term, int number, String name, double amount, int interest_rate) {
		super(term, number, name, amount, interest_rate);
		this.interest_rate = this.interest_rate +2;
		
	}
	
}