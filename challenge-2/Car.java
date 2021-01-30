/**
 * <code>Car</code> Class
 * <p>
 * Write a class named <code>Car</code> that has the following fields:
 * <ul>
 * <li><code>yearModel</code>. The <code>yearModel</code> field is an <code>int</code> that holds the car's year model.
 * <li><code>make</code>. The <code>make</code> references a <code>String</code> object that holds the make of the car.
 * <li><code>speed</code>. The <code>department</code> field references a <code>String</code> object that holds the name of
 * </ul>
 * <p>
 * In addition, the class should have the following constructor and other methods.
 * <ul>
 * <li>Constructor. The constructor should accept the car's year model and make as arguments.
 *     These values should be assigned to the object's <code>yearModel</code> and <code>make</code> fields. The
 *     constructor should also assign <code>0</code> to the <code>speed</code> field.
 * <li>Accessors. Appropriate accessor methods should get the values stored in an object's
 *     <code>yearModel</code>, <code>make</code>, and <code>speed</code> fields.
 * <li><code>accelerate</code>. The <code>accelerate</code> method should add <code>5</code> to the <code>speed</code> field each time it is called.
 * <li><code>brake</code>. The <code>brake</code> method should subtract <code>5</code> from the <code>speed</code> field each time it is called.
 * </ul>
 * <p>
 * 
 * @author Alec Leong
 */
public class Car {
	private int yearModel; // The car's year model.
	private String make;   // The make of the car.
	private int speed;     // The car's current speed.
	
	/**
	 * Parameterized constructor with two parameters.
	 * Create a car and initialize the following fields:
	 * <ul>
	 * <li><code>yearModel</code>  - The value of the <code>int</code> parameter <code>yearModel</code>.
	 * <li><code>make</code>       - The value of the <code>String</code> object parameter <code>make</code>.
	 * <li><code>speed</code>      - The <code>int</code> value <code>0</code>.
	 * </ul>
	 * @param yearModel  the car's year model
	 * @param make       the make of the car
	 */
	public Car(int yearModel, String make) {
		this.yearModel = yearModel;
		this.make = make;
		speed = 0;
	}
	
	/**
	 * Get the car's year model.
	 * @return	an <code>int</code> referencing the car's year model
	 */
	public int getYearModel() {
		return yearModel;
	}
	
	/**
	 * Get the make of the car.
	 * @return	a <code>String</code> referencing make of the car
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * Get the car's current speed
	 * @return	an <code>int</code> referencing the car's current speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * The <code>accelerate</code> method should add <code>5</code> to the <code>speed</code> field each time it is called.
	 */
	public void accelerate() {
		speed += 5;
	}
	
	/**
	 * The <code>brake</code> method should subtract <code>5</code> from the <code>speed</code> field each time it is called.
	 */
	public void brake() {
		speed -= 5;
	}
}
