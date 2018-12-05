import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8000);

        while (true) {

            Socket clientSocket = serverSocket.accept();

            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
            writer.write("<h1>Java</h1");
            writer.flush();

            writer.close();
            clientSocket.close();

        }
//        serverSocket.close();
    }
}
