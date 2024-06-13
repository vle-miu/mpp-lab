package lecture3.prob1;

public class PersonWithJob {
	
	private double salary;

	private Person person;

	PersonWithJob(String name, double s) {
		salary = s;
		person = new Person(name);
	}

	public double getSalary() {
		return salary;
	}

	public Person getPerson() {
		return this.person;
	}

	@Override
	public boolean equals(Object aPersonWithJob) {
		if(aPersonWithJob == null) return false; 

		if(!(aPersonWithJob instanceof PersonWithJob)) return false;

		PersonWithJob p = (PersonWithJob) aPersonWithJob;

		boolean isEqual = this.getPerson().getName().equals(p.getPerson().getName()) &&
				this.getSalary() == p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 40000);
		PersonWithJob p2 = new PersonWithJob("Joe", 40000);

		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));

		Person p3 = new Person("Joe");
		// p2 should be not equal to p3
		System.out.println("p2.equals(p3)? " + p2.equals(p3));
	}

}
