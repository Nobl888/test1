```java
package com.ecommerceapp.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkUtils {

    private static final int READ_TIMEOUT = 10000;
    private static final int CONNECT_TIMEOUT = 15000;

    public static String GET(String requestUrl) throws IOException {
        URL url = new URL(requestUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(READ_TIMEOUT);
        conn.setConnectTimeout(CONNECT_TIMEOUT);
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
        int response = conn.getResponseCode();
        if (response == HttpURLConnection.HTTP_OK) {
            InputStream is = conn.getInputStream();
            return readStream(is);
        } else {
            throw new IOException("HTTP error code: " + response);
        }
    }

    public static void POST(String requestUrl, String jsonData) throws IOException {
        URL url = new URL(requestUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(READ_TIMEOUT);
        conn.setConnectTimeout(CONNECT_TIMEOUT);
        conn.setRequestMethod("POST");
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        conn.connect();
        OutputStream os = conn.getOutputStream();
        os.write(jsonData.getBytes("UTF-8"));
        os.close();
        int response = conn.getResponseCode();
        if (response != HttpURLConnection.HTTP_OK) {
            throw new IOException("HTTP error code: " + response);
        }
    }

    private static String readStream(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] data = new byte[1024];
        int length;
        while ((length = is.read(data)) != -1) {
            sb.append(new String(data, 0, length));
        }
        is.close();
        return sb.toString();
    }
}
```