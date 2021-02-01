/**
 * Demonstrate PersonalInformation class by writing a program that creates three
 * instances of it. One instance should hold your information, and the other two
 * should hold your friends’ or family members' information.
 * 
 * @author Alec Leong
 */
public class PersonalInformationDemo {
	public static void main(String[] args) {
		PersonalInformation person1 = new PersonalInformation();
		person1.setName("Jim Halpert");
		person1.setAddress("3831 Calvert Street, Van Nuys. CA 91401");
		person1.setAge(42);
		person1.setPhoneNumber("+1-308-726-7327");
		
		PersonalInformation person2 = new PersonalInformation("Pam Halpert", "3831 Calvert Street, Van Nuys. CA 91401", 41, "+1-308-512-7656");
		PersonalInformation person3 = new PersonalInformation("Oscar Martinez", "5232 Longridge Ave, Sherman Oaks, CA 91401", 48, "+1-308-756-5660");
		
		System.out.println(person1);
		System.out.println();
		System.out.printf("Name: %s\nAddress: %s\nAge: %d\nPhone number: %s\n", person2.getName(), person2.getAddress(),
				person2.getAge(), person2.getPhoneNumber());
		System.out.println();
		System.out.print(person3);
		System.out.println();
	}
}
