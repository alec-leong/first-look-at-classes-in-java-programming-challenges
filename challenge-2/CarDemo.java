/**
 * Demonstrate the Car class in a program that creates a Car object, and then calls the accelerate
 * method five times. After each call to the accelerate method, get the current speed of the car
 * and display it. Then call the brake method five times. After each call to the brake method, get
 * the current speed of the car and display it.
 * 
 * @author Alec Leong
 */
public class CarDemo {
	public static void main(String[] args) {
		final int NUM_ITERATIONS = 5;
		Car vehicle1 = new Car(2021, "Toyota Supra");
		
		printYearAndMake(vehicle1);

		// Accelerate.
		for (int numAccelerations = 0; numAccelerations < NUM_ITERATIONS; numAccelerations++) {
			vehicle1.accelerate();
			printSpeed(vehicle1);
		}
		
		// Brake.
		for (int numBrakes = 0; numBrakes < NUM_ITERATIONS; numBrakes++) {
			vehicle1.brake();
			printSpeed(vehicle1);
		}
	}
	
	public static void printYearAndMake(Car vehicle) {
		System.out.printf("Year: %d\nMake: %s\n", vehicle.getYearModel(), vehicle.getMake());
	}
	
	public static void printSpeed(Car vehicle) {
		System.out.printf("Speed: %-2d m/s\n", vehicle.getSpeed());
	}
}
