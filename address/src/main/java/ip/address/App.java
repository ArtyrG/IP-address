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

		String[] massFirstIp = app.stringToInt(ip1);
		String[] massSecondIp = app.stringToInt(ip2);
		
		app.ipCon(massFirstIp, massSecondIp);

	}
	
	// method accepts a string from the ip and split ( "\\.") in an array of strings
	public String[] stringToInt(String ip) {
		if (!(ip.isEmpty())) {
			String[] massiveIP = ip.split("\\.");
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
	
	//method accepts two arrays takes 4 decimal numbers and finds ip between them
	public void ipCon(String[] massFirstIp, String[] massSecondIp) {

		if (massFirstIp[3].equals(massSecondIp[3])) {
			showIp(massFirstIp);
		} else {
			Integer i1 = Integer.valueOf(massFirstIp[3]);
			Integer i2 = Integer.valueOf(massSecondIp[3]);
			if (i1 > i2) {
				int i = i1 - i2;
				for (int j = 0; j < i - 1; j++) {
					i2++;
					String f = String.valueOf(i2);
					massSecondIp[3] = f;
					showIp(massSecondIp);
				}
			} else {
				int i = i2 - i1;
				for (int j = 0; j < i - 1; j++) {
					i1++;
					String f = String.valueOf(i1);
					massFirstIp[3] = f;
					showIp(massFirstIp);
				}

			}
		}
	}
}
