
import java.util.Scanner;

public class homework7_19 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to your psychic reading! I'm a super good psychic!");
		System.out.println("I see that you can read, is that correct? Simply reply with a yes or no..");
		String answer = userInput.nextLine();
		if (answer.equals("yes")) {
			System.out.println("I knew it, I am psychic!");
		} else {
			System.out.println("Oh no, my third eye has an eyelash in it...");
		}
		System.out.println("My third eye says you're under 80 years old, yes or no?");
		String answer2 = userInput.nextLine(); 
		if (answer2.equals("yes")) {
			System.out.println("Madame Cleo always knows!");
		} else {
			System.out.println("Well your spirit feels very young...");
		}
		System.out.println("Well, that's all my third eye can see! Would you like to pay now or later?");
		String answer3 = userInput.nextLine();
		if (answer3.equals("now")) {
			System.out.println("Perfect, I take cash, credit and assorted gems!");
		} else {
			System.out.println("I'll mail you the bill plus ample interest! Toodles!");
		}
	}
}