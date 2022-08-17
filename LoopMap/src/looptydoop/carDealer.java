package looptydoop;
import java.util.*;
public class carDealer {

	public static void main(String[] args) {
		Map<String, String> cars = new HashMap<>();
		
		cars.put("Civic", "Honda");
		cars.put("CRV", "Honda");
		cars.put("Wrangler", "Jeep");
		cars.put("Camaro", "Chevrolet");
		cars.put("Model X", "Tesla");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! What model of car were you looking for today?");
		
		String m = sc.next();
		if (cars.containsKey(m)) {
			System.out.println("Oh you're looking for a " + m + "! Our " + cars.get(m) + "s are right over here!");
		}
		else {
			System.out.println("Sorry, we do not have any of your desired model. We can contact you when we do!");
		}
		
	}

}
