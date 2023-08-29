
/*----------------concrete product class --------------*/

public class PepperoniPizza extends Pizza {
	public PepperoniPizza(String prefSize, String prefSpicy) {
		name = "Pepperoni Pizza";
		size = prefSize;
		spicy = prefSpicy;
		toppings.add("White Pepper");
	}
}


