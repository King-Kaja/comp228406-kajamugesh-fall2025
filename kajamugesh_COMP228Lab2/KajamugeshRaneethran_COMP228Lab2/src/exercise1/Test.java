package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
	private int correct = 0;
	private final int total = 5;
	private int[] answerIndex = { 0, 2, 2, 1, 3 };
	private String [] answers = {"//", "Class", "Properties", "7", "15"};

	public static void main(String[] args) {
		Test test = new Test();
		test.inputAnswer();

	}

	public int simulateQuestion(int questionIndex) {
		String question = switch (questionIndex) {
		case 0 -> "Which one of the following symbols indicates a single line comment in Java application source code";
		case 1 -> "Which of the following components does a Java application need to have at least one of?";
		case 2 -> "What does an instance variable describe?";
		case 3 -> "How many significant digits does a floating-point number have?";
		case 4 -> "How many significant digits does a double precision number have?";
		default -> "Invalid";
		};
		
		String[] options = switch (questionIndex) {
		case 0 -> new String[] {
				"//","##","#!","\\\\\\\\" };
		case 1 -> new String[] {"Instance variable", "Local variable", "Class","Non-static Method"};
		case 2 -> new String[] { "Height", "Behaviour", "Properties", "Measurement"};
		case 3 -> new String[] {"5","7","10","15"};
		case 4 -> new String[] {"5","7","10","15"};
		default -> new String[] {};
		};
		
		
		return JOptionPane.showOptionDialog(null, question, "", 
	            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	            null, options, options[0]);

	}

	public boolean checkAnswer(int question, int answer) {

		return (answerIndex[question] == answer);

	}

	public String generateMessage(boolean correct) {

		Random randomObject = new Random();
		String message;
		if (correct) {
			message = switch (randomObject.nextInt(4)) {
			case 0 -> "Excellent!";
			case 1 -> "Good!";
			case 2 -> "Keep up the good work!";
			case 3 -> "Nice work!";
			default -> "Invalid";
			};
			this.correct += 1;
		} else {
			message = switch (randomObject.nextInt(4)) {
			case 0 -> "No. Please try again";
			case 1 -> "Wrong. Try once more";
			case 2 -> "Don't give up!";
			case 3 -> "No. Keep trying.";
			default -> "Invalid";
			};

		}
		return message;

	}

	public void inputAnswer() {
		JOptionPane.showMessageDialog(null, "Press OK to start Test", "Test", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i = 0; i < 5; i++) {
			boolean correctCheck = checkAnswer(i,simulateQuestion(i));
			String message = generateMessage(correctCheck);
			if (correctCheck) {
				JOptionPane.showMessageDialog(null, message, "Test", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, message + " The correct answer was " + answers[i], "Test", JOptionPane.INFORMATION_MESSAGE);
			}
			  
			}
		double percentage = ((double) correct / (double) total) * 100;
		JOptionPane.showMessageDialog(null, "Correct answers: " + correct + "\nIncorrect answers: " + (total - correct) + "\nScore: " + percentage + "%", "Test", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
