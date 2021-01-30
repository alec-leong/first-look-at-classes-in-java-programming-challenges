/**
 * Write a separate program that creates three Employee objects to hold the following data:
 * 
 * Name            ID Number    Department       Position
 * ----------------------------------------------------------------
 * Susan Meyers    47899        Accounting       Vice President    
 * Mark Jones      39119        IT               Programmer
 * Joy Rogers      81774        Manufacturing    Engineer
 * 
 * @author Alec Leong
 */
public class EmployeeDemo {
	public static void main(String[] args) {
		Employee worker1 = new Employee();
		worker1.setName("Susan Meyers");
		worker1.setIdNumber(47_899);
		worker1.setDepartment("Accounting");
		worker1.setPosition("Vice President");
		
		Employee worker2 = new Employee("Mark Jones", 39_119);
		worker2.setDepartment("IT");
		worker2.setPosition("Programmer");
		
		Employee worker3 = new Employee("Joy Rogers", 81_774, "Manufacturing", "Engineer");
		
		printHeading();
		printEmployee(worker1);
		printEmployee(worker2);
		printEmployee(worker3);
	}
	
	public static void printHeading() {
		System.out.println("Name            ID Number    Department       Position\n" +
				"----------------------------------------------------------------");
	}
	
	public static void printEmployee(Employee worker) {
		System.out.printf("%-16s%-13s%-17s%s\n",
				worker.getName(), worker.getIdNumber(), worker.getDepartment(), worker.getPosition());
	}
}
