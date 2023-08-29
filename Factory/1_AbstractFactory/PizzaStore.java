
public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item, String size, String spicy);
  	protected abstract void print_bill_amount();
	
	public Pizza orderPizza(String type, String size, String spicy) {
		Pizza pizza = createPizza(type, size, spicy);		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
