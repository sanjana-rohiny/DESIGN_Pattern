/*----------------concrete product class --------------*/

public class CheesePizza extends Pizza {
	public CheesePizza(String prefSize, String prefSpicy) {
		name = "Cheese Pizza";
		size = prefSize;
		spicy = prefSpicy;
		toppings.add("Grated Cheese");
	}
}
