

public class COCHINPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item, String size, String spicy) {
		Pizza pizza = null;
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(size, spicy);
			pizza.setName("Cochin Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(size, spicy);
			pizza.setName("Cochin Style Veggie Pizza");
 
		} else if (item.equals("pepper")) {

			pizza = new PepperoniPizza(size, spicy);
			pizza.setName("Cochin Style Pepperoni Pizza");
 
		} 
		return pizza;
	}

        protected void print_bill_amount() {
		System.out.println("Cochin price after discount  = 2$");
	}
	
}
