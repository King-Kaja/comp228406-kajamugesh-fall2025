package exercise3;

public class Waiter {

	public static void main(String[] args) {
		serve();
		serve(2);
		serve(3, "root beer");

	}

	public static void serve() {
		System.out.println("The Waiter serves you a glass of water");
	}

	public static void serve(int glasses) {
		System.out.println("The Waiter serves you " + glasses + " glasses of water");

	}

	public static void serve(int glasses, String drink) {
		System.out.println("The Waiter serves you " + glasses + " glasses of " + drink);
	}

}
