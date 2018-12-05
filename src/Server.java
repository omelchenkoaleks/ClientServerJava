import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8000);

        // Создаем связь с клиентом через сокет:
        Socket clientSocket = serverSocket.accept();

        // Сделаем обертку над OutputStream, чтобы была возможность отправлять строки
        OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
        writer.write("<h1>Java</h1");
        // Гарантирует, что сообщение будет прямо сейчас отправлено
        writer.flush();

        // Как что-нибудь отправить через этот сокет?
//        clientSocket.getOutputStream().write(64);

        writer.close();
        clientSocket.close();
        serverSocket.close();
    }
}
