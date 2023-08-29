

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight    = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		LivingroomLightOnCommand livingRoomLightOn   =  new LivingroomLightOnCommand(livingRoomLight);
		LivingroomLightOffCommand livingRoomLightOff =  new LivingroomLightOffCommand(livingRoomLight);

		KitchenLightOnCommand kitchenLightOn 	=  new KitchenLightOnCommand(kitchenLight);
		KitchenLightOffCommand kitchenLightOff  =  new KitchenLightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn   =  new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff =  new CeilingFanOffCommand(ceilingFan); 
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
  
		remoteControl.PushOnButton(0);
		remoteControl.PushOFFButton(0);
		remoteControl.PushOnButton(1);
		remoteControl.PushOFFButton(1);

		remoteControl.PushOnButton(2);

		System.out.println("Undo Celing Fan..ON");
		remoteControl.PushUndoButton(2);
		
	}
}
