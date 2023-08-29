

//
// This is the invoker
//
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
 	Command undoCommand;
	public RemoteControl() {
		onCommands = new Command[7]; // 7 is max, so far used upto 3
		offCommands = new Command[7];
		NoCommand noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}

		// undo command holder
		undoCommand = noCommand; 
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void PushOnButton(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
 
	public void PushOFFButton(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void PushUndoButton(int slot) {
		// undo the last button press
		undoCommand.undo();
	}
}
