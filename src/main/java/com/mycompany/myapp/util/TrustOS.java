package com.mycompany.myapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class TrustOS {

    private static final String PROXY_HOST_URI = "localhost";
    private static final int PROXY_PORT = 5657;
    private static final String BASE_URL = "https://pro.virtualtrust.io";

    public enum CallType {
        POST,
        GET,
    }

    private static String readResponse(InputStream in) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1;) {
            out.append(new String(b, 0, n));
        }
        in.close();
        return out.toString();
    }

    public String call(CallType callType, String url, Object jsonInput, String... token) {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(PROXY_HOST_URI, PROXY_PORT));

            URL httpUrl = new URL(BASE_URL + url);

            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection(proxy);

            conn.setRequestMethod(callType.name());
            conn.setRequestProperty("Content-Type", "application/json");
            if (token.length >= 1) {
                conn.setRequestProperty("Authorization", "Bearer " + token[0]);
            }
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            // input json
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInput.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            conn.connect();

            if (conn.getResponseCode() == 200) {
                String jsonOutput = readResponse((InputStream) conn.getContent());
                conn.disconnect();
                return jsonOutput;
            } else {
                return "The method post method response " + conn.getResponseCode();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
