package com.example.as48940.mywork;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by as48940 on 5/8/2017.
 */

public class WsCall extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... params) {

        StringBuilder result = new StringBuilder();
        String urlString = params[0];
        String method = params[1];
        try {
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(method);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.connect();

            InputStream inputStream = httpURLConnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";

            while (( line = bufferedReader.readLine()) != null){
                result.append(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
