package exercise2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Lotto {
	private int[] numbers;

	public Lotto() {
		Random random = new Random();
		numbers = new int[] { random.nextInt(9) + 1, random.nextInt(9) + 1, random.nextInt(9) + 1 };
	}

	public int[] getNumbers() {
		return numbers;
	}

	public static void main(String[] args) {
		boolean win = false;
		for (int i = 0; i < 5; i++) {
			Lotto lotto = new Lotto();
			int sum = lotto.getNumbers()[0] + lotto.getNumbers()[1] + lotto.getNumbers()[2];
			int guess = Integer.valueOf(JOptionPane.showInputDialog("Enter an integer between 3 and 27"));
			if (sum == guess) {
				win = true;
				JOptionPane.showMessageDialog(null, "You win!", "Lotto", JOptionPane.INFORMATION_MESSAGE);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong! Try again.", "Lotto", JOptionPane.INFORMATION_MESSAGE);

			}

		}
		if (!win) {

			JOptionPane.showMessageDialog(null, "You Lose!", "Lotto", JOptionPane.INFORMATION_MESSAGE);
		}

	}
}