package lecture8.prob2A;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee joe1 = new Employee("Joe", 150000);
		Employee joe2 = new Employee("Joe", 100000);
		
		System.out.println(joe1.equals(joe2));
		
		EmployeeNameComparator nameComp = new EmployeeNameComparator();
		System.out.println(nameComp.compare(joe1, joe2));
	}
}
