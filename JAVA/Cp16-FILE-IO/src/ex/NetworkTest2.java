package ex;

import java.net.URL;
import java.nio.charset.MalformedInputException;

public class NetworkTest2 {

	public static void main(String[] args) {
		URL url = null;
		
		String address = "https://www.google.com/search?hl=ko&ei=G8G4XvyYG8ndmAXqlYCwAw&q=java&oq=java&gs_lcp=CgZwc3ktYWIQAzIECAAQRzIECAAQRzIECAAQR1AAWABg4aohaABwAXgAgAEAiAEAkgEAmAEAqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwi8ktSE6qrpAhXJLqYKHeoKADYQ4dUDCAw&uact=5";
		
				
				
				
	try {
		url = new URL(address);
		URLConnection conn = url.openConnection();
		
	}catch (MalformedInputException e) {
		e.printStackTrace();
		
	}catch (IOExeption e) {
		e.printStackTrace();
	}
		
	}

}
