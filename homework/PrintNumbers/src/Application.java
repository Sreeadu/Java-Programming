
public class Application {

	public static void main(String[] args) {
		int x;
		for (x = 5 ; x<100 ; x = x+10) {
			
			if (x == 95) {
				System.out.println(x);
			} else {
				System.out.print(x + ", ");
			}
		}
	}

}
