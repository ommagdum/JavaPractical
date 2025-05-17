package Exp12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatS {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2000);
        Socket client = serverSocket.accept();
        while(true){
            try{
                BufferedReader in, out;
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter po = new PrintWriter(client.getOutputStream(), true);
                System.out.println("\nServer : ");
                String st2 = in.readLine();
                po.println(st2+" :");
                String st = out.readLine();
                System.out.println("String from client : " + st);
                if(st2.equalsIgnoreCase("bye")){
                    break;
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
