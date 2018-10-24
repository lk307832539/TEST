package com.lk.util;


import org.apache.http.client.HttpClient;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpRequestUtil {

    public static String doGet(String requestUrl) {
        //测试
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
            if (200 == urlCon.getResponseCode()) {
                InputStream inputStream = urlCon.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                StringBuilder sb = new StringBuilder();

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line);
                }

                bufferedReader.close();
                inputStreamReader.close();
                inputStream.close();
                return sb.toString();
            } else {
                return "error";
            }
        } catch (
                IOException e)

        {
            return "error";
        }

    }

    public static String doPost(String requestUrl, String params) {
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            printWriter.write(params);
            printWriter.flush();

            //开始获取数据
            BufferedInputStream bis = new BufferedInputStream(httpURLConnection.getInputStream());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len;
            byte[] arr = new byte[1024];
            while ((len = bis.read(arr)) != -1) {
                bos.write(arr, 0, len);
                bos.flush();
            }
            bos.close();
            return bos.toString();
        } catch (Exception e) {
            return "error";
        }
    }

    public static String doPost(String requestUrl, Map<String, String> map) {
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());

            StringBuilder params = new StringBuilder();
            for (String key : map.keySet()) {
                if (params.length() != 0) {
                    params.append("&");
                }
                params.append(key).append("=").append(map.get(key));
            }

            printWriter.write(params.toString());
            printWriter.flush();

            //开始获取数据
            BufferedInputStream bis = new BufferedInputStream(httpURLConnection.getInputStream());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len;
            byte[] arr = new byte[1024];
            while ((len = bis.read(arr)) != -1) {
                bos.write(arr, 0, len);
                bos.flush();
            }
            bos.close();
            return bos.toString();
        } catch (Exception e) {
            return "error";
        }
    }


    //测试
    public static void main(String args[]) {
        System.out.println(doGet("https://nkgs631a.ad001.siemens.net:1001/Service1.svc/GetPOHeaderInfo/800012036751"));
    }
}
