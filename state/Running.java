

public class Running extends State {	
 	IPManager ipManager;     	


    public Running(IPManager ipm) {
	this.ipManager = ipm;
    }
 
	public void enter() {
		System.out.println("Running State : Enter");
		System.out.println("Running State : Sending dhcp_running_msg");
		ipManager.sendMessage(State.dhcp_running_msg);
	}
 
	public void exit() {
		System.out.println("Running State : Exit");
	}
 
 
	public void handle(int msg) {
		System.out.println("Running State : handle -> Msg = " + msg);
		if(msg == State.dhcp_start_msg) {
			System.out.println("Unexpected dhcp_start_msg...ignore");			
				
		} else if(msg == State.dhcp_started_msg) {
			System.out.println("Unexpected dhcp_started_msg...ignore");

		} else if(msg == State.dhcp_running_msg) {
			System.out.println("Expected dhcp_running_msg");
			System.out.println("----------> do active in dhcp running activity");			

		} else if(msg == State.dhcp_stop_msg) {
			System.out.println("Expected dhcp_stop_msg...Stopping");			
			ipManager.quit();
		} else if(msg == State.dhcp_connect_msg) {
			System.out.println("Expected dhcp_connect_msg...Connected ..!!");
		} else if(msg == State.dhcp_data_msg) {
			System.out.println("Expected dhcp_data_msg...DHCP Data ..!!");
		}

	}
 
}
