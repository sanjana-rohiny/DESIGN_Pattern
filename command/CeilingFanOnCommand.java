

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}

	public void undo() {
		// undo the last button press
		if(ceilingFan.getSpeed() == 1) {
			ceilingFan.off();
		} else {
			System.out.println("Already in Off State");
		}
	}
}
