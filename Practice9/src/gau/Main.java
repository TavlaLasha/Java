package gau;

//import gau.first.Client;
//import gau.first.Server;
import gau.second.Client;
import gau.second.Server;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Server server = new Server();
        client.start();
        server.start();
    }
}
