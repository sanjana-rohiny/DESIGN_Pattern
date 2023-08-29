

public class BLRPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item, String size, String spicy) {
		Pizza pizza = null;
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(size, spicy);
			pizza.setName("Bangalore Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(size, spicy);
			pizza.setName("Bangalore Style Veggie Pizza");
 
		} else if (item.equals("pepper")) {

			pizza = new PepperoniPizza(size, spicy);
			pizza.setName("Bangalore Style Pepperoni Pizza");
 
		} 
		
		return pizza;
	}

        public void print_bill_amount() {
		System.out.println("Bangalore price after discount  = 5$");
	}
	
}
