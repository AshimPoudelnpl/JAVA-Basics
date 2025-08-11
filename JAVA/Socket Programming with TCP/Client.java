import java.net.*;
import java.io.*;
import java.util.*;

public class Client{
    public static void main(String[] args) throws IOException {
        //1.Open socket Connection to server
        Socket socket= new Socket("localhost",6969);

        //2.Make input and output handler
        Scanner ins= new Scanner(socket.getInputStream());
        PrintWriter outs= new PrintWriter(socket.getOutputStream(),true);

        //3.Send a Message to Server
        outs.println(5);

        //4.Recieve a Message from Server
        int fact= ins.nextInt();

        //5.Display results from server
        System.out.println("Input Number:"+5);
        System.out.println("Factorial Numbers from Server:"+fact);

       //6. Close al lConnections
        ins.close();
        outs.close();
        socket.close();

    }
}