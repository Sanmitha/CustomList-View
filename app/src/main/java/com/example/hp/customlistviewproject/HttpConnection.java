package com.example.hp.customlistviewproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Vasuki on 12/9/2017.
 */

public class HttpConnection
{
    public static String getData(String uri)
    {
        BufferedReader reader = null;
        HttpURLConnection connection = null;
        try {
            URL url = new URL(uri);
            connection = (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(1000);
            connection.setDoInput(true);
            connection.setConnectTimeout(1000);
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String data = null;
            String web = "";
            while ((data = reader.readLine()) != null) {
                web += data + "\n";
            }
            return web;

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        finally
        {
            if (reader != null)
                try
                {
                    reader.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                    return null;
                }
            connection.disconnect();
        }


    }


}
