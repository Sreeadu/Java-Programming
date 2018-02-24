import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("What is the number of laps:");
		Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    scanner.nextLine();
	    
	    if (number < 1) {
	    	System.out.println("You gave me an invalid number of laps");
	    	System.exit(0);
	    }
	    
	    double total = 0;
	    
	    for (int x=1 ; x<number + 1; x=x+1) {
	    	System.out.println("How long did it take for this lap:");
			double number2 = scanner.nextDouble();
		    scanner.nextLine();
		    total = total + number2;	    
	    }
	    scanner.close();
	    double average = total/number; 
	    System.out.println("I took " + total + " minutes to run " + number + " lap(s)." );
	    System.out.println("The average time taken was " + average + " minutes." );
	}

}
