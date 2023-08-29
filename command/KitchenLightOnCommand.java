

public class KitchenLightOnCommand implements Command {
	Light light;

	public KitchenLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	public void undo() {
		
		//TB implemented
	}
}
