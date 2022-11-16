package com.mycompany.myapp.util;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TrustOS {

    private static final String PROXY_HOST_URI = "localhost";
    private static final int PROXY_PORT = 5657;
    private static final String BASE_URL = "https://pro.virtualtrust.io";

    public JsonObject get(String url, String token) {
        Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress(PROXY_HOST_URI, PROXY_PORT));
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setProxy(proxy);

        RestTemplate restTemplate = new RestTemplate(requestFactory);

        // create headers
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(token.split(" ")[1]);

        // build the request
        HttpEntity<Void> request = new HttpEntity<>(headers);

        // send GET request
        ResponseEntity<String> response = restTemplate.exchange(BASE_URL + url, HttpMethod.GET, request, String.class);

        // check response
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful");
            System.out.println(response.getBody());
            return JsonParser.parseString(response.getBody()).getAsJsonObject();
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
            return null;
        }
    }

    public JsonObject post(String url, JsonObject body, String token) {
        Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress(PROXY_HOST_URI, PROXY_PORT));
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setProxy(proxy);

        RestTemplate restTemplate = new RestTemplate(requestFactory);

        // create headers
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        if (token != null) headers.setBearerAuth(token.split(" ")[1]);

        HttpEntity<String> request = new HttpEntity<String>(body.toString(), headers);

        // send POST request
        ResponseEntity<String> response = restTemplate.postForEntity(BASE_URL + url, request, String.class);

        // check response
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful");
            System.out.println(response.getBody());
            return JsonParser.parseString(response.getBody()).getAsJsonObject();
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
            return null;
        }
    }

    public JsonObject post(String url, JsonObject body) {
        return post(url, body, null);
    }
}
