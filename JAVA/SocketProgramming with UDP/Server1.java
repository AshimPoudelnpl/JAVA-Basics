import java.net.*;
import java.io.*;
public class Server1 {

    public static void main(String[] args)throws IOException {
        //1.Create Datagram Socket
        DatagramSocket socket=new DatagramSocket(6968);
        System.out.println("server is Listening on Port "+ socket.getPort());

        //2.Recieve reequest  from client
        byte [] bytes =new byte[256];
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
        socket.receive(packet);
        
        //3.prepare message for client 
        InetAddress address=packet.getAddress();
        int Port=packet.getPort();
        String s="Hello k XA Khabar";
        bytes=s.getBytes();

        //4.Send Message to Client
        packet=new DatagramPacket(bytes,bytes.length,address,Port);
        socket.send(packet);

        //5.Close Socket
        socket.close();
        
    }
}