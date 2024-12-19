import java.net.*;
import java.io.*;
public class Example3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == 200) {
                System.out.println("Successfully connected to " + url);
            } else {
                System.out.println("Failed to connect. Response code: " + responseCode);
            }

        } catch (MalformedURLException e) {
            System.err.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error during connection: " + e.getMessage());
        }
    }
}
