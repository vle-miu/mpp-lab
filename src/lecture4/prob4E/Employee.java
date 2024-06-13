package lecture4.prob4E;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;

	private List<Account> accounts  = new ArrayList<>();

	public Employee(String name) {
		this.name = name;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public String getName() {
		return name;
	}

	public double computeUpdatedBalanceSum() {
		double computeUpdatedBalanceSum = 0.0;
		for (Account account : accounts) {
			computeUpdatedBalanceSum += account.computeUpdatedBalance();
		}

		return computeUpdatedBalanceSum;
	}
}
