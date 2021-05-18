package gau.first;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {
    Socket socket;
    ObjectInputStream objectInputStream;
    String serverMessage, clientMessage;
    ObjectOutputStream objectOutputStream;

    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            while (true) {
                socket = serverSocket.accept();
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                clientMessage = (String) objectInputStream.readObject();
                if(clientMessage.equals("bye")){
                    serverMessage = "Good Bye!";
                }
                else {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Server:");
                    serverMessage = scanner.nextLine();
                }
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(serverMessage);

                if(clientMessage.equals("bye")){
                    System.exit(0);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
