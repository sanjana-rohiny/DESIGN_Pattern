
/*----------------concrete product class --------------*/
public class VeggiePizza extends Pizza {
	public VeggiePizza(String prefSize, String prefSpicy) {
		name = "Veggie Pizza";
		size = prefSize;
		spicy = prefSpicy;
		toppings.add("Grilled Vegitables");
	}
}

