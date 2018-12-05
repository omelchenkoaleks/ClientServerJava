import java.net.*;
import java.io.*;


public class Client {

    public static void main(String[] args) throws IOException {

        // Создаем сокет для подключения к серверу. Это простейший вариант сокета,
        // который пока еще ничего не делает, но уже подключается к серверу.
        Socket clientSocket = new Socket("127.0.0.1", 8000);

        // Научим нашего клиента получать что-нибудь от сервера.
        // Используем обертку, чтобы считать сразу строки.
        // И нужна еще одна обертка BufferedReader().
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
        String message = reader.readLine();
        System.out.println(message);

        clientSocket.close();

    }
}
