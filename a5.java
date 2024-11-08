// Write a program to accept a URL and display its fields (protocol, host, etc.).
import java.net.*;

public class a5{
	public static void main(String[] args){
		try{
		URL url = new URL("https://www.google.com:8080");
		System.out.println("HOST "+url.getHost());
		System.out.println("PROTOCOL "+url.getProtocol());
		System.out.println("PATH "+url.getPath());
		System.out.println("PORT "+url.getPort());
		}
		catch(Exception e){
		System.out.println(e);
		}
	}
}
