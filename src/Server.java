import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) throws IOException {

        int count = 0;

        ServerSocket serverSocket = new ServerSocket(8000);

        while (true) {

            Socket clientSocket = serverSocket.accept();

            System.out.println("Client accepted " + (++count));

            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
            writer.write("You are client #" + count + "\n");
            writer.flush();

            writer.close();
            clientSocket.close();

        }
//        serverSocket.close();
    }
}
