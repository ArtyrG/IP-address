package ip.address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Arthur
 * @version 0.1
 *
 */
public class App {
	String[] firstIP; // storage for 1 ip
	String[] secondIP; // storage for 2 ip

	public static void main(String[] args) throws IOException {
		
		// for input from the console
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("Input first IP :");
		//entry in the string 1 ip 
		String ip1 = reader.readLine(); 
		System.out.println("Input second IP :");
		//entry in the string 2 ip 
		String ip2 = reader.readLine();
		System.out.println("All ip mask 255.255.255.000 :");
		
		App app = new App();

		String[] a1 = app.stringToInt(ip1, app.firstIP);
		String[] b1 = app.stringToInt(ip2, app.secondIP);
		

	}
	
	// method accepts a string from the ip and split ( "\\.") in an array of strings
	public String[] stringToInt(String ip, String[] massiveIP) {
		if (!(ip.isEmpty())) {
			massiveIP = ip.split("\\.");
			String[] ad = massiveIP;
			return ad;
		} else {
			String[] ad = { "No input ip!" };
			return ad;
		}
	}
}
