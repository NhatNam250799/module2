package BaiTap;

public class AccessModifier {
	public String name;

	private int age;

	protected String address;

	String phoneNumber;

	public AccessModifier(String name, int age, String address, String phoneNumber) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	    }

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {

		AccessModifier person = new AccessModifier("John", 25, "123 Main St", "123-456-7890");

		System.out.println("Name: " + person.name);

		System.out.println("Age: " + person.getAge());

		Employee employee = new Employee("Alice", 30, "456 Elm St", "987-654-3210");
		employee.displayInfo();
	}
}

class Employee extends AccessModifier {

	public Employee(String name, int age, String address, String phoneNumber) {
		super(name, age, address, phoneNumber);
	}

	public void displayInfo() {
	        System.out.println("Name: " + name); 
	        System.out.println("Age: " + getAge()); 
	        System.out.println("Address: " + address); 
	   
	    }
}


