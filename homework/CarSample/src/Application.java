
public class Car {
	int power;
	String brand;

	Boolean isStarted = false;

	public void Start() {

		if (isStarted) {
			System.out.println("Hey!The car is already started");
		} else {
			System.out.println("Starting the " + brand);
		}
	}

	public void Stop() {
		System.out.println("Stopping the " + brand);
	}
}
