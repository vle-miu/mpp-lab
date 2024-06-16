package quiz3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Customer> list = Arrays.asList(new Customer(1001, "Nhat", "Fairfield"),
				new Customer(1002, "Thinh", "Newyork"),
				new Customer(1003, "Duy", "London"),
				new Customer(1004, "Hana", "London"),
				new Customer(1005, "Davis", "Paris"),
				new Customer(1006, "John", "London"));

		System.out.println(LambdaLibary.CUSTOMER_NAME_FILER.apply(list, "London"));
	}
}
