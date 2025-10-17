package exercise1;

import java.util.Scanner;
import java.util.ArrayList;



public class Driver {

	public static void main(String[] args) {
		ArrayList<Insurance> insurances = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		
		while (!done) {
			Insurance insurance;
			
			System.out.println("Enter the type of Insurance (Health or Life):");

			
			String type = scanner.next();
			
			if (type.equals("Health")) {
				insurance = new Health();
			}
			else {
				insurance = new Life();
			}
			
			System.out.println("Enter monthly cost:");
			
			insurance.setInsuranceCost(scanner.nextDouble());
			insurances.add(insurance);
			
			System.out.println("Are you done? (y/n):");
			if(scanner.next().equals("y")) {
				done = true;
			}
		}
		
		scanner.close();
		
		for (int i = 0; i < insurances.size(); i++) {
			insurances.get(i).displayInfo();
			
		}

		

	}

}
