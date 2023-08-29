

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " Rs" + beverage.cost());
 
		Beverage beverage2 = new Espresso();
		beverage2 = new Soy(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " Rs" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Soy(beverage3);
		beverage3 = new Milk(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " Rs" + beverage3.cost());

		Beverage beverage4 = new HouseBlend();
		beverage4 = new ShotEspresso(beverage4);
		beverage4 = new Soy(beverage4);
		beverage4 = new Milk(beverage4);
		System.out.println(beverage4.getDescription() 
				+ " Rs" + beverage3.cost());



	}
}
