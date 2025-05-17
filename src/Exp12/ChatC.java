package Exp12;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatC {
    public static void main(String[] args) throws IIOException {
        try{
            Socket client = new Socket("localhost", 2000);
            System.out.println("\nConnected: ");
            while(true){
                BufferedReader in, out;
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter po = new PrintWriter(client.getOutputStream(),true);
                String s2 = out.readLine();
                System.out.println("Server : "+s2);
                String s1 = in.readLine();
                System.out.println("Client : "+s1);
                po.println(s1);
                if (s1.equalsIgnoreCase("bye")){
                    break;
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
