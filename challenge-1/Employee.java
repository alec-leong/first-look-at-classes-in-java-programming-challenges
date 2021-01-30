/**
 * <code>Employee</code> Class
 * <p>
 * Write a class named <code>Employee</code> that has the following fields:
 * <ul>
 * <li><code>name</code>. The <code>name</code> field references a <code>String</code> object that holds the employee's name.
 * <li><code>idNumber</code>. The <code>idNumber</code> is an <code>int</code> variable that holds the employee's ID number.
 * <li><code>department</code>. The <code>department</code> field references a <code>String</code> object that holds the name of
 *     the department where the employee works.
 * <li><code>position</code>. The <code>position</code> field references a <code>String</code> object that holds the employee's
 *     job title.
 * </ul>
 * <p>
 * The class should have the following constructors:
 * <ul>
 * <li>A constructor that accepts the following values as arguments and assigns them to the
 *     appropriate fields: employee's name, employee's ID number, department, and position.
 * <li>A constructor that accepts the following values as arguments and assigns them to the
 *     appropriate fields: employee's name and ID number. The <code>department</code> and <code>position</code>
 *     fields should be assigned an empty string (<code>""</code>).
 * <li>A no-arg constructor that assigns empty strings (<code>""</code>) to the <code>name</code>, <code>department</code>, and
 *     <code>position</code> fields, and <code>0</code> to the <code>idNumber</code> field.
 * </ul>
 * <p>
 * Write appropriate mutator methods that store values in these fields and accessor methods
 * that return the values in these fields.
 * 
 * @author Alec Leong
 */
public class Employee {
	private String name; 		// The employee's name.
	private int idNumber; 		// The employee's ID number.
	private String department; 	// The name of the department where the employee works.
	private String position;	// The employee's job title.
	
	/**
	 * No-argument constructor.
	 * <p>
	 * Create an employee and initialize the following fields:
	 * <ul>
	 * <li><code>name</code> 	 	- An empty <code>String</code> object <code>""</code>.
	 * <li><code>idNumber</code> 	- The <code>int</code> value <code>0</code>.
	 * <li><code>department</code> 	- An empty <code>String</code> object <code>""</code>.
	 * <li><code>department</code> 	- An empty <code>String</code> object <code>""</code>.
	 * </ul>
	 */
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}

	/**
	 * Parameterized constructor with two parameters.
	 * <p>
	 * Create an employee and initialize the following fields:
	 * <ul>
	 * <li><code>name</code> 	 	- The value of the <code>String</code> object parameter <code>name</code>.
	 * <li><code>idNumber</code> 	- The value of the <code>int</code> parameter <code>idNumber</code>.
	 * <li><code>department</code> 	- An empty <code>String</code> object <code>""</code>.
	 * <li><code>department</code> 	- An empty <code>String</code> object <code>""</code>.
	 * </ul>
	 * @param name 		the employee's name
	 * @param idNumber	the employee's ID number
	 */
	public Employee(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		department = "";
		position = "";
	}

	/**
	 * Parameterized constructor with four parameters.
	 * <p>
	 * Create an employee and initialize the following fields:
	 * <ul>
	 * <li><code>name</code> 	 	- The value of the <code>String</code> object parameter <code>name</code>.
	 * <li><code>idNumber</code> 	- The value of the <code>int</code> parameter <code>idNumber</code>.
	 * <li><code>department</code> 	- The value of the <code>String</code> object parameter <code>department</code>.
	 * <li><code>department</code> 	- The value of the <code>String</code> object parameter <code>position</code>.
	 * </ul>
	 * @param name 			the employee's name
	 * @param idNumber 		the employee's ID number
	 * @param department	the name of the department where the employee works
	 * @param position 		the employee's job title
	 */
	public Employee(String name, int idNumber, String department, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}
	
	/**
	 * Set the employee's name.
	 * @param name	the employee's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Set the employee's ID number.
	 * @param idNumber	the employee's ID number
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	/**
	 * Set the name of the department where the employee works.
	 * @param department	the name of the department where the employee works
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * Set the employee's job title.
	 * @param position	the employee's job title
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * Get the employee's name.
	 * @return	a <code>String</code> referencing the employee's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the employee's ID number.
	 * @return	an <code>int</code> referencing the employee's ID number
	 */
	public int getIdNumber() {
		return idNumber;
	}
	
	/**
	 * Get the name of the department where the employee works.
	 * @return	a <code>String</code> referencing the name of the department where the employee works
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * Get the employee's job title.
	 * @return	a <code>String</code> referencing the employee's job title
	 */
	public String getPosition() {
		return position;
	}
}
