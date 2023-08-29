

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck(FlyBehavior fb, QuackBehavior qb) {
		flyBehavior = fb;
		quackBehavior = qb;
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
