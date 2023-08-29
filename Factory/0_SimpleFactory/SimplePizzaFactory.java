public class SimplePizzaFactory {

	public Pizza createPizza(String type, String size, String spicy) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza(size, spicy);
		} else if (type.equals("pepper")) {
			pizza = new PepperoniPizza(size, spicy);
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(size, spicy);
		}
		return pizza;
	}
}
