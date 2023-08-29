
/*-------------Product class -----------------*/

import java.util.ArrayList;

abstract public class Pizza {
	String name;
	String size;
	String spicy;
	ArrayList<String> toppings = new ArrayList<String>();

	public void setName(String string) {
		name = string;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

	public void print_description() {
		System.out.println("Name = " + name + "\nSize = " + size + "\nSpicy = " + spicy +"\n\n");

	}
}

