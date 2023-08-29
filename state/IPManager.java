
 
public class IPManager extends StateMachine 
{
	private static final long serialVersionUID = 2L;
	State stoppedState;
	State startedState;
	State runningState;
		
	public IPManager() {

		// create states as per state chart
		stoppedState = new Stopped(this);
		startedState = new Started(this);
		runningState = new Running(this);
		
		// add states to stae machine
		addState(stoppedState);
		addState(startedState);
		addState(runningState);

		// initialize the first state, obviously it will be Stopped state 
		initializeState(stoppedState);
	}
 
	// this command will start dhcp session, grrr...its an imaginory dhcp
	public void startDhcp() {		
		// sending dhcp_start_msg message, this should be captured in stoppedState
		sendMessage(State.dhcp_start_msg);
	}
 	
	public void sendDhcpConnect() {		
		// sending dhcp_connect_msg message, this should be captured in runningState
		sendMessage(State.dhcp_connect_msg);
	}

	public void sendDhcpData() {		
		// sending dhcp_data_msg message, this should be captured in runningState
		sendMessage(State.dhcp_data_msg);
	}

	public void stopDhcp() {		
		// sending dhcp_stop_msg message
		sendMessage(State.dhcp_stop_msg);
	}

	State getStoppedState() {
		return stoppedState;
	}

	State getStartedState() {
		return startedState;
	}

	State getRunningState() {
		return runningState;
	}

	//overriding quit function of StateMachine 
	void quit() {
		// get lost, thats the end of Ipmanager
		System.out.println("Quit IPmanager ");	
		// state machine function	
		exit();
	}
}
