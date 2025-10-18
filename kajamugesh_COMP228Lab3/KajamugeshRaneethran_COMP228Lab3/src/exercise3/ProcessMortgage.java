package exercise3;

import java.util.ArrayList;
import java.util.Scanner;


public class ProcessMortgage {

	public static void main(String[] args) {
		ArrayList<Mortgage> Mortgages = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the current interest rate:");
		
		int interest_rate = scanner.nextInt();
		
		for (int i = 0; i < 3; i++) {
			Mortgage Mortgage;
			
			
			System.out.println("Enter the type of mortgage(business or personal):");
			String type = scanner.next();
			
			System.out.println("Enter the term(short, medium, or long):");
			String term = scanner.next();
			
			System.out.println("Enter the mortgage number:");
			int number = scanner.nextInt();
			
			System.out.println("Enter the customer name:");
			String name = scanner.next();
			
			System.out.println("Enter the amount of the mortgage:");
			double amount = scanner.nextDouble();
			
			if(amount > 300000) {
				amount = 300000;
			}
			
			if (type.equals("business")) {
				Mortgage = new BusinessMortgage(term, number, name, amount, interest_rate);
			}
			else {
				Mortgage = new PersonalMortgage(term, number, name, amount, interest_rate);
			}
			
			
			Mortgages.add(Mortgage);
			
		}
		
		scanner.close();
		
		for (int i = 0; i < Mortgages.size(); i++) {
			Mortgages.get(i).getMortgageInfo();
			
		}


	}

}
