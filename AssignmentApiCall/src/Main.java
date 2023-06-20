import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
       URL url = null;
        HttpURLConnection connection = null;
        int responseCode = 0;
        String urlApi = "https://api.chucknorris.io/jokes/random";
        // URL
        try {
             url = new URL(urlApi);
        } catch (MalformedURLException e) {
            System.out.println("Url Problem");
        }

        // Http Connection
        try {
             connection =(HttpURLConnection) url.openConnection();
             responseCode = connection.getResponseCode();
        } catch (IOException e) {
            System.out.println("Connection Problem  or response Code Problem");
        }

        if(responseCode == 200){
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder  ApiData = new StringBuilder();
            String readLine = null;
            while((readLine = in.readLine())!= null){
                ApiData.append(readLine);
            }

            System.out.println(ApiData);
            in.close();

        }else{
            System.out.println("Api could not call by Any reason may be response Code is not correct");
        }

    }
}