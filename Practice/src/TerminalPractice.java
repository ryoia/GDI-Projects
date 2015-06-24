import java.util.Scanner;

public class TerminalPractice {

	public enum Choices {
		JOKES, SONGS, NOTHING;
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String res = "";
		while (!res.equals("0")) {
			System.out.println("Please choose one of the following commands: ");
			System.out.println("Or enter 0 to cancel");
			int count = 1;
			for (Choices c: Choices.values()) {
				System.out.println(count + ". " + c);
				count++;
			}
			
			res = reader.next();
			System.out.println("You have entered: " + res);
			System.out.println(inputResponse(res));
		} 
		System.out.println("Good bye!");
	}

	static String inputResponse(String input) {
		switch (input) {
		case "1":
			return "Why did Jon Snow wait 24 hours in front of the Apple store? For the watch!";
		case "2":
			return "Jingle bells, jingle bells!";
		case "3":
			return "I guess you chose nothing!";
		default:
			return "hmm";
		}
	}
}
