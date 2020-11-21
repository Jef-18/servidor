import java.io.*;
import java.net.*;
import java.io.BufferedReader;

class Server {

  public static void main(String[] args) throws Exeptions
  {

    try
    {
      ServerSocket socket = new ServerSocket(9515);
      System.out.println("\n\n Waiting connection... \n");

      while(true)
      {
        Socket connection = socket.accept();

        BufferedReader bfr = new
        BufferedReader(new
          InputStreamReader(
            connection.getInputStream()
          )
        );
        String message = null;

        // ler o buffer
        while((message = brf.readLine()) != null)
        {
          if (message.equals("hello"))
          {
            System.out.primtln("Você digitou Hello");
          }
          else 
          {
            System.out.primtln("Esperava mais de você");
          }
          System.out.println(message);
        }
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }   
  }

}
