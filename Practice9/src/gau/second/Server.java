package gau.second;

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
    String[] unknownHelpArr = {"Hmm...", "Sorry could not get it.", "What?", "Sorry did not understand.", "You can ask me these: help, date, name, error."};

    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            while (true) {
                serverMessage="Hmmm...";
                socket = serverSocket.accept();
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                clientMessage = (String) objectInputStream.readObject();
                switch (clientMessage.toLowerCase()){
                    case "bye", "exit", "good bye":
                        System.exit(0);
                        break;
                    case "help":
                        serverMessage = "Sorry I can't for now.";
                        break;
                    case "date":
                        break;
                    case "name":
                        break;
                    case "error":
                        break;
                    case "thanks", "thanks!":
                        serverMessage = "My pleasure!";
                        break;
                    default:
                        serverMessage = unknownHelpArr[(int)(Math.random()*unknownHelpArr.length)];

                }
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(serverMessage);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
