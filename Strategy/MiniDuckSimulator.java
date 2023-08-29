

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 

	Duck  redHeadDuck = new RedHeadDuck(new FlyWithWings(), new Quack());
	redHeadDuck.display();
	redHeadDuck.performFly();
	redHeadDuck.performQuack();

	Duck rubberDuck = new RubberDuck(new FlyNoWay(), new MuteQuack());
	rubberDuck.display();
	rubberDuck.performFly();
	rubberDuck.performQuack();

	}
}
