package ip.address;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	@Test
	public void testStringToInt() {
		String ip = "192.168.1.1";
		String[] testIp = { "192", "168", "1", "1" };
		App app = new App();
		String[] returnIp = app.stringToInt(ip);

		for (int i = 0; i < testIp.length; i++) {
			assertEquals(testIp[i], returnIp[i]);
		}
	}

}
