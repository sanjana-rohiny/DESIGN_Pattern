


 
public class IPManagerTestDrive {
 
	public static void main(String[] args) {
		
		IPManager ipm = new IPManager();
		
		// start dhcp sesstion
		ipm.startDhcp();

		// send dhcp connect request
		ipm.sendDhcpConnect();
 
		// send dhcp data
		ipm.sendDhcpData();

		// send dhcp data
		ipm.sendDhcpData();

		// stop dhcp 
		ipm.stopDhcp();

	}
}
