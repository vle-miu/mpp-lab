package lecture7.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");


		//print each element of the list in upper case format
		ConsumerImpl impl = new ConsumerImpl();
		list.forEach(impl::accept);
	}

	//implement a Consumer
	static class ConsumerImpl implements Consumer<String> {
		@Override
		public void accept(String s) {
			System.out.println(s.toUpperCase());
		}
	}
}