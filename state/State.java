

import java.io.*;
  
public abstract class State {
	abstract void enter();
	abstract void handle(int Msg);
	abstract void exit();

	public static int dhcp_start_msg     = 100;
	public static int dhcp_started_msg   = 200;
	public static int dhcp_running_msg   = 300;
	public static int dhcp_stop_msg      = 400;
	public static int dhcp_connect_msg   = 500;
	public static int dhcp_data_msg      = 600;

}
