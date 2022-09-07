package com.mycompany.myapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TrustOS {

    private static final String PROXY_HOST_URI = "localhost";
    private static final int PROXY_PORT = 5657;
    private static final String BASE_URL = "https://pro.virtualtrust.io";

    public enum CallType {
        POST,
        GET,
    }

    private static JsonObject readResponse(InputStream in) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1;) {
            out.append(new String(b, 0, n));
        }
        in.close();
        return JsonParser.parseString(out.toString()).getAsJsonObject();
    }

    public JsonObject call(CallType callType, String url, Object... other) {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(PROXY_HOST_URI, PROXY_PORT));

            URL httpUrl = new URL(BASE_URL + url);

            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection(proxy);

            conn.setDoOutput(true);
            conn.setRequestMethod(callType.name());
            conn.setRequestProperty("Content-Type", "application/json");

            // token jwt
            if (other.length >= 2) {
                conn.setRequestProperty("Authorization", other[1].toString());
            }

            // input json
            if (other[0] != null && other.length >= 1) {
                conn.setRequestProperty("Accept", "application/json");
                try (OutputStream os = conn.getOutputStream()) {
                    byte[] input = other[0].toString().getBytes("utf-8");
                    os.write(input, 0, input.length);
                }
            }

            conn.connect();

            if (conn.getResponseCode() == 200) {
                JsonObject jsonOutput = readResponse((InputStream) conn.getContent());
                System.out.println("PETICION RESPUESTA");
                System.out.println(jsonOutput);
                conn.disconnect();
                return jsonOutput;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
