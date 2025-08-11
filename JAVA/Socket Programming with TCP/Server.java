import java.net.*;
import java.io.*;
import java.util.*;
public class Server {
    static int fact(int a){
        if (a==0) {
            return 1;
        }
        return a*fact(a-1);
    }

    public static void main(String[] args)throws  IOException {
        //1.Create a server Soocket
        ServerSocket s=new ServerSocket(6969);

        //2.Accept Client Socket Connection
        Socket clienSocket=s.accept();

        //3.create input and output handlers
        Scanner ins =new Scanner(clienSocket.getInputStream());
        PrintWriter out=new PrintWriter(clienSocket.getOutputStream(),true);

        //4.Recieve Message from client
        int num =ins.nextInt();

        //5.Calculte Factorial and send result to client 
        out.println(fact(num));

         //6.Close all Connections
         s.close();
         clienSocket.close();
         ins.close();
         out.close(); 
        
    }
}