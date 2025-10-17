package exercise2;

import java.util.Scanner;
import java.util.ArrayList;



public class Driver {

	public static void main(String[] args) {
		ArrayList<GameTester> gameTesters = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		
		while (!done) {
			GameTester gameTester;
			System.out.println("Enter the name of the game tester:");
			
			String name = scanner.next();
			
			System.out.println("Enter the type of game tester (full or part):");

			
			String type = scanner.next();
			
			if (type.equals("full")) {
				gameTester = new FullTimeGameTester(name);
			}
			else {
				System.out.println("Enter the number of hours the work:");
				gameTester = new PartTimeGameTester(name, scanner.nextInt());
			}
			
			
			gameTesters.add(gameTester);
			
			System.out.println("Are you done? (y/n):");
			if(scanner.next().equals("y")) {
				done = true;
			}
		}
		
		scanner.close();
		
		for (int i = 0; i < gameTesters.size(); i++) {
			gameTesters.get(i).displayInfo();
			
		}

		

	}

}
