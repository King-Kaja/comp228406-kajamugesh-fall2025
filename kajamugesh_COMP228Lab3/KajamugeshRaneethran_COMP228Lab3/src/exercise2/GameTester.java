package exercise2;

abstract class GameTester {
	protected String name;
	protected boolean status;
	
	abstract public void determine_salary();

	protected abstract void displayInfo();

}

class FullTimeGameTester extends GameTester{
	private double salary;
	
	public FullTimeGameTester(String name){
		this.name = name;
		determine_salary();
	}

	@Override
	public void determine_salary() {
		status = true; // full time status
		salary = 3000;
		
	}
	
	public void displayInfo(){
		System.out.printf("%s is a Full time game tester with a salary of $%.2f\n",name, salary);
	}
	
}

class PartTimeGameTester extends GameTester{
	private double salary = 20;
	private int hours = 0;
	
	public PartTimeGameTester(String name, int hours) {
		this.name = name;
		this.hours = hours;
		determine_salary();
	}

	@Override
	public void determine_salary() {
		status = false; // full time status
		salary = salary * hours;
		
	}
	
	public void displayInfo(){
		System.out.printf("%s is a Part time game tester with a salary of $%.2f\n",name, salary);
	}
	
}