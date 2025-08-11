import  java.net.*;
import java.io.*;
public class Client1 {

    public static void main(String[] args)throws IOException {
        //1.Create Datagram Socket 
        DatagramSocket socket=new DatagramSocket();
        byte[] bytes= new byte[256];
        InetAddress address=InetAddress.getByName("localhost");
        
        //2.Send request to server
        DatagramPacket packet = new DatagramPacket(bytes, 256, address, 6968);
        socket.send(packet);

        //3.Read response from Server
        socket.receive(packet);
        
        //4.Display Response
        String recieved =new String(packet.getData());
        System.out.println("server says::"+recieved);

        //5.close the socket
        socket.close();
    }
}