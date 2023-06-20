package org.example;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)throws Exception  {

        URL url = null;
        HttpURLConnection connection = null;
        int responseCode = 0;

        String urlString = "https://api.chucknorris.io/jokes/random";
     ////  url
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            System.out.println("Url problem ...!!!!");
        }
        //// connection

        try {
            connection =(HttpURLConnection) url.openConnection();
            responseCode = connection.getResponseCode();
        } catch (Exception e) {
            System.out.println("Connection or Response Code Problem...!!!!");
        }

      if(responseCode == 200){

          BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
           StringBuilder apiData = new StringBuilder();
           String readLine = null;

           while((readLine = in.readLine())!= null){
               apiData.append(readLine);
           }

           in.close();
//           System.out.println(apiData);

          JSONObject objectInJson = new JSONObject(apiData.toString());
          System.out.println(objectInJson.toString());
      }else{
          System.out.println("API could not call ....!!!!!");
      }
    }
}