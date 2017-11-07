import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello ASE2017 - How are you now? :)");

		System.out.print("What is your name?");
		Scanner input = new Scanner(System.in);
		String userName = input.nextLine();
		
		HelloUser greeting = new HelloUser();
		greeting.greetUser(userName);
		
		input.close();

	}

}
