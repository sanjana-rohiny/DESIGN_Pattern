

public class RubberDuck extends Duck {
 
	public RubberDuck(FlyBehavior fb, QuackBehavior qb) {
		flyBehavior = fb;
		quackBehavior = qb;
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
