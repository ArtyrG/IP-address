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

		String[] massFirstIp = app.stringToInt(ip1, app.firstIP);
		String[] massSecondIp = app.stringToInt(ip2, app.secondIP);
		

	}
	
	// method accepts a string from the ip and split ( "\\.") in an array of strings
	public String[] stringToInt(String ip, String[] stringIP) {
		if (!(ip.isEmpty())) {
			stringIP = ip.split("\\.");
			String[] massiveIP = stringIP;
			return massiveIP;
		} else {
			String[] massiveIP = { "No input ip!" };
			return massiveIP;
		}
	}
	
	// method to display ip
	public void showIp(String[] show) {

		for (int i = 0; i < show.length; i++) {

			if (i == show.length - 1) {
				System.out.println(show[i]);
			} else {
				System.out.print(show[i] + ".");
			}
		}
	}
}
