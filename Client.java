import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws Exeptions
  	{
  		try
  		{
  		Socket client = new Socket("192.168.56.1", 9515);
  		String message = null;

  		BuffereadReder bfr = new BuffereadReder (
  			new InputStreamReader(System.in)
  		);

  		DataOutputStream dos = new DataOutputStream (
  			client.getOutputStream()
  		);

  		System.Out.println("Type your message..: ");

  		message = bfr.readLine();

  		dos.writeBytes(message + "\n");

  		client.close();

  		}
  		catch (Exception e)
  		{
  			e.printStackTrace();
  		}
  	}
}
