import java.net.*;
import java.io.*;


public class Client {

    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket("127.0.0.1", 8000);

        BufferedWriter writer =
                new BufferedWriter(
                        new OutputStreamWriter(
                                clientSocket.getOutputStream()));

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                clientSocket.getInputStream()));

        // в полученный поток отправляем сообщение
        writer.write("Get me some information");
        writer.newLine();
        writer.flush();

        // ожидаем полученное сообщение и выводим его на
        String response = reader.readLine();
        System.out.println(response);

        writer.close();
        reader.close();

        clientSocket.close();

    }
}
