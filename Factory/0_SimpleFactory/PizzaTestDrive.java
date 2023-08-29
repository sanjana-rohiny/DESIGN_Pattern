

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		/*
		SimplePizzaFactory factory = new SimplePizzaFactory();		
		Pizza cheesePizza = factory.createPizza("cheese", "regular", "high");
		cheesePizza.print_description();
		/// this code is not suitable for reuse, and SOLID principles, 
		/// so we introduce a new concept - of pizzaStore
		*/

		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese", "Regular Size", "medium spicy");
		System.out.println("We ordered a piza with below details");
		pizza.print_description();

 
		pizza = store.orderPizza("veggie", "Large Size", "High spicy");
		System.out.println("We ordered a piza with below details");
		pizza.print_description();

	}
}
