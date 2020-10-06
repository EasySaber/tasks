import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class get {
    public static void main(String[] args) throws IOException {
        final String url = "http://jsonplaceholder.typicode.com/users";

        URL get = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) get.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;

        final String name = "\"name\": \"";
        final String email = "\"email\": \"";
        String strName = null;
        while ((inputLine = input.readLine()) != null) {
            if (inputLine.contains(name)) {
                strName = inputLine.substring(inputLine.lastIndexOf(name) + name.length() , inputLine.lastIndexOf('"'));
            }
            if (inputLine.contains(email)) {
                String strEmail = inputLine.substring(inputLine.lastIndexOf('.') + 1, inputLine.lastIndexOf('"'));
                if (strEmail.equals("org") || strEmail.equals("net")) {
                    System.out.println(strName);
                }
            }
        }
        input.close();
    }
}
