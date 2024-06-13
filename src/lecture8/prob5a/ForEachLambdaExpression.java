package lecture8.prob5a;

import java.util.Arrays;
import java.util.List;


public class ForEachLambdaExpression {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(e -> System.out.println(e.toUpperCase()));
	}
}