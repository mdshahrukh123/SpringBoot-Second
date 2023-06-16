package org.example;

import org.json.JSONObject;

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

        String  urlString = "https://api.zippopotam.us/us/33162";

        // url
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            System.out.println("URL problem ");
        }
        // Http

        try {
            connection = (HttpURLConnection) url.openConnection();
            responseCode = connection.getResponseCode();
        } catch (IOException e) {
            System.out.println("Connection problem ... ");
        }

        if(responseCode == 200){
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder ApiData = new StringBuilder();
            String readLine = null;

            while((readLine = in.readLine())!= null){
                ApiData.append(readLine);
            }


            JSONObject jsonObject = new JSONObject(ApiData.toString());
            System.out.println("places : "+jsonObject.get("places"));
            System.out.println(jsonObject.toString());
            in.close();
         }else{
            System.out.println("Api could not Call responseCode is not correct");
        }

    }
}