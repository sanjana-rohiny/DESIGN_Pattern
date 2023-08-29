

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}

	public void undo() {
		
		if(ceilingFan.getSpeed() == 0) {
			ceilingFan.high();
		} else {
			System.out.println("Already in On State");
		}
	}
}
