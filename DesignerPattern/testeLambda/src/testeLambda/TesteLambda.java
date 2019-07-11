package testeLambda;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TesteLambda {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		System.out.print("*--------------- For each\n");
		for(int number : numbers) {
			System.out.printf(" O Numero � : %s\n",number);
		}
		System.out.print("*--------------- Lambda\n");
		 Arrays.asList(1,2,3,4,5,6).forEach(number->System.out.printf(" O Numero � : %s\n",number)); 
		

	}

}
