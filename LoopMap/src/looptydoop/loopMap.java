package looptydoop;
import java.util.*;

public class loopMap {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<5; i++) {
			System.out.println(i+1 + ". Please enter a number: ");
			numbers.add(sc.nextInt());
		}
		
		System.out.println(numbers);
		
		int sum = 0;
		int prod = 1;
		int biggest = numbers.get(0);
		int smallest = numbers.get(0);
		
		for (int j = 0; j<numbers.size(); j++) {
			sum += numbers.get(j);
			prod *= numbers.get(j);
			if (numbers.get(j)>biggest) {
				biggest = numbers.get(j);
			}
			if (numbers.get(j)<smallest) {
				smallest = numbers.get(j);
			}

		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + prod);
		System.out.println("Largest: " + biggest);
		System.out.println("Smallest: " + smallest);
		
		

	}

}


