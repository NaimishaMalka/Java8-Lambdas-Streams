import java.util.Arrays;
import java.util.List;

public class AverageOfListOfIntegers {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("The Average of given list of Integers is "+ findAverage(li));
	}

	 static Double findAverage(List<Integer> li) {
		 return (li.stream().mapToDouble(i-> i)
				 			.reduce(0, (c,e)->c+e))/li.size();
	}

}
