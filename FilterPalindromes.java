import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("madam","hello","epam","great","level","test","computer");
		List<String> res =  findPalindromes(li);
		res.forEach(System.out::println);		
	}
	
	static List<String> findPalindromes(List<String> li) {
		return li.stream().filter(str -> str.equals(new StringBuffer(str).reverse().toString()))
						  .collect(Collectors.toList());
	}

}
