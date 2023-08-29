

public class KitchenLightOffCommand implements Command {
	Light light;
 
	public KitchenLightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}


	public void undo() {
		
		// TB Implemented
	}
}
