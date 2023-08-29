

public class ShotEspresso extends CondimentDecorator {
	Beverage beverage;

	public ShotEspresso(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", EspressoShot";
	}

	public double cost() {
		return 15 + beverage.cost();
	}
}
