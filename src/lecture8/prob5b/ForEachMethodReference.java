package lecture8.prob5b;

import java.util.Arrays;
import java.util.List;


public class ForEachMethodReference {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(ForEachMethodReference::accept);
	}

	private static void accept(String e) {
		System.out.println(e.toUpperCase());
	}
}