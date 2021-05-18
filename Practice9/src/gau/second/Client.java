package gau.second;

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
            while(true){
                socket = new Socket(InetAddress.getByName("localhost"), 8081);
                System.out.print("Client: ");
                clientMessage = sc.nextLine();
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(clientMessage);
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                serverMessage = (String) objectInputStream.readObject();
                System.out.println("Server: "+serverMessage);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
