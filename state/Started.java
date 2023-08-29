

public class Started extends State {	
 	IPManager ipManager;     	


    public Started(IPManager ipm) {
	this.ipManager = ipm;
    }
 
	public void enter() {
		System.out.println("Started State : Enter");
		System.out.println("Started State : Sending dhcp_started_msg");
		ipManager.sendMessage(State.dhcp_started_msg);
	}
 
	public void exit() {
		System.out.println("Started State : Exit");
	}
 
 
	public void handle(int msg) {
		System.out.println("Started State : handle -> Msg = " + msg);
		if(msg == State.dhcp_start_msg) {
			System.out.println("Unexpected dhcp_start_msg...ignore");			
				
		} else if(msg == State.dhcp_started_msg) {
			System.out.println("Expected Message ...Please do something to imaginory dhcp and change state to Running");
			ipManager.changeState(ipManager.getRunningState());

		} else if(msg == State.dhcp_running_msg) {
			System.out.println("Unexpected dhcp_running_msg...ignore");			

		} else if(msg == State.dhcp_stop_msg) {
			System.out.println("Expected dhcp_stop_msg...Stopping");
			ipManager.quit();
		}
	}
 
}
