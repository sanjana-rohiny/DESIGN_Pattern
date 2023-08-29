

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore blrStore = new BLRPizzaStore();
		PizzaStore cochinStore = new COCHINPizzaStore();
 
		//Pizza pizza = blrStore.orderPizza("cheese", "Regular", "Less Spicy");
		
		Pizza pizza = blrStore.createPizza("cheese", "Regular", "Less Spicy");
		System.out.println("We ordered a piza with below details");
		pizza.print_description();
		blrStore.print_bill_amount(); 

		//pizza = cochinStore.orderPizza("pepper", "Regular", "High Spicy");
		pizza = cochinStore.createPizza("cheese", "Regular", "Less Spicy");
		pizza.print_description();
		cochinStore.print_bill_amount(); 
		
	}
}


/*
massively powerful if applied to suitable use cases. Then your program will be much more flexible


Factory create product..
based on the type of product, different concrete product classes will be instantiated.

Concrete factory initiatiate factory abstract class.
Concrete product initiatiate product abstaract class or interface.

Abstarct factory
----------------
Any copncrete factory can procuce different product.
That uis it can create families of related dipendent product.

The key point is the families of related product.

Can have multiple concrete factory
Muntiple product 
Muntiple concrete product 

Absratct Factory return different concretion of a concrerte factory

*/
