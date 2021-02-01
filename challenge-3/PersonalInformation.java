/**
 * <code>PersonalInformation</code> Class
 * <p>
 * Write a class named <code>PersonalInformation</code> that has the following fields:
 * <ul>
 * <li><code>name</code>. The <code>name</code> field references a <code>String</code> object that holds the person's name.
 * <li><code>address</code>. The <code>address</code> field references a <code>String</code> object that holds the person's address.
 * <li><code>age</code>. The <code>age</code> is an <code>int</code> field that holds the person's age.
 * <li><code>phoneNumber</code>. The <code>phoneNumber</code> field references a <code>String</code> object that holds the person's phoneNumber.
 * </ul>
 * <p>
 * The class has the following constructors:
 * <ul>
 * <li>A constructor that accepts the following values as arguments and assigns them to the
 *     appropriate fields: person's name, address, age, and phone number.
 * <li>A no-arg constructor that assigns empty strings (<code>""</code>) to the <code>name</code>, <code>address</code>, and
 *     <code>phone number</code> fields, and <code>0</code> to the <code>age</code> field.
 * </ul>
 * <p>
 * Write appropriate mutator methods that store values in these fields and accessor methods
 * that return the values in these fields.
 * 
 * @author Alec Leong
 */
public class PersonalInformation {
	private String name;                 // The person's name.
	private String address;              // The person's address.
	private int age;                     // The person's age.
	private String phoneNumber;          // The person's phone number.
	private static int numInstances = 0; // A class variable referencing the number of instances.

	/**
	 * No-argument constructor. 
	 * <p>
	 * Increments the class variable <code>numInstances</code>.
	 * <p>
	 * Create a personal information and initialize the following fields:
	 * <ul>
	 * <li><code>name</code>         - An empty <code>String</code> object <code>""</code>.
	 * <li><code>address</code>      - An empty <code>String</code> object <code>""</code>.
	 * <li><code>age</code>          - The <code>int</code> value <code>0</code>.
	 * <li><code>phoneNumber</code>  - An empty <code>String</code> object <code>""</code>.
	 * </ul>
	 */
	public PersonalInformation() {
		name = "";
		address = "";
		age = 0;
		phoneNumber = "";
		numInstances++;
	}

	/**
	 * Parameterized constructor with four parameters.
	 * Create a personal information and initialize the following fields:
	 * <ul>
	 * <li><code>name</code>         - The value of the <code>String</code> object parameter <code>name</code>.
	 * <li><code>address</code>      - The value of the <code>String</code> object parameter <code>address</code>.
	 * <li><code>age</code>          - The value of the <code>int</code> parameter <code>age</code>.
	 * <li><code>phoneNumber</code>  - The value of the <code>String</code> object parameter <code>phoneNumber</code>.
	 * </ul>
	 * @param name         the person's name
	 * @param address      the person's address
	 * @param age          the person's age
	 * @param phoneNumber  the person's phone number
	 */
	public PersonalInformation(String name, String address, int age, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
		numInstances++;
	}

    /**
     * Override the parent class' <code>toString()</code> method.
	 * @return	a <code>String</code> object referencing the person's personal information.
     */
    @Override public String toString() {
    	StringBuilder strBuilder = new StringBuilder("Name: ");
    	strBuilder.append(name).append("\nAddress: ").append(address)
    		.append("\nAge: ").append(age).append("\nPhone Number: ").append(phoneNumber);
    	
    	return strBuilder.toString();
    }
    
	/**
	 * Set the person's name.
	 * @param name	the person's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Set the person's address.
	 * @param address	the person's address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Set the person's age.
	 * @param age	the person's age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Set the person's phone number.
	 * @param phoneNumber	the person's phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Get the person's name.
	 * @return	a <code>String</code> object referencing the person's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the person's address.
	 * @return	a <code>String</code> object referencing the person's address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Get the person's age.
	 * @return	an <code>int</code> object referencing the person's age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Get the person's phone number.
	 * @return	a <code>String</code> object referencing the person's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Get the number of instances of the <code>PersonalInformation</code> class.
	 * @return	an <code>int</code> referencing the the number of instances of the <code>PersonalInformation</code> class.
	 */
	public static int getNumInstances() {
		return numInstances;
	}
}
