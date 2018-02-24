import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("What is your grade:");
		Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    scanner.close();
		
	    if (number <= 5) {
			System.out.println("Elementary School");
		} else if (number <= 8) {
			System.out.println("Middle School");
		} else if (number <= 12) {
			System.out.println("High School");
		} else {
			System.out.println("College");
		}
	    
	}

}
