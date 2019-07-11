import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class comparatorClass {

	public static void main(String[] args) {
		// given
	    List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 110);
	    Integer expectedResult = 89;
	 
	    // then
	    Integer max = listOfIntegers
	      .stream()
	      .mapToInt(v -> v)
	      .min().orElseThrow(NoSuchElementException::new);	 
	    
	    System.out.printf("Should be  %s and min is %s", expectedResult, max);

	}

}
