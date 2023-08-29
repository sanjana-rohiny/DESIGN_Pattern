

public class Stopped extends State {	    	
 	IPManager ipManager;     	


    public Stopped(IPManager ipm) {
	this.ipManager = ipm;
    }
 
	public void enter() {
		System.out.println("Stopped State : Enter");
	}
 
	public void exit() {
		System.out.println("Stopped State : Exit");
	}
 
 

	public void handle(int msg) {
		System.out.println("Stopped State : handle -> Msg = " + msg);
		if(msg == State.dhcp_start_msg) {
			System.out.println("Expected dhcp_start_msg .. Chage state to Started and Strt Dhcp");	
			// change state to started -> this will invoke Started->enter()
			ipManager.changeState(ipManager.getStartedState());		
				
		} else if(msg == State.dhcp_started_msg) {
			System.out.println("Unexpected dhcp_started_msg...ignore");

		} else if(msg == State.dhcp_running_msg) {
			System.out.println("Unexpected dhcp_running_msg...ignore");

		} else if(msg == State.dhcp_stop_msg) {
			System.out.println("Expected dhcp_stop_msg...Stopping");
			ipManager.quit();
		}
	}
	
}
