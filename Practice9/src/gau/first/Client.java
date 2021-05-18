package gau.first;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    Socket socket;
    ObjectOutputStream objectOutputStream;
    String serverMessage, clientMessage;
    ObjectInputStream objectInputStream;
    String ip;

    public void run(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Client IP: ");
            ip = sc.nextLine();
            while(true){
                socket = new Socket(InetAddress.getByName(ip), 8080);
                System.out.print("Client: ");
                clientMessage = sc.nextLine();
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(clientMessage);
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                serverMessage = (String) objectInputStream.readObject();
//                System.out.println("Server:"+serverMessage);
                if(serverMessage.equals("bye")){
//                    System.out.println(message1);
                    System.exit(0);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
