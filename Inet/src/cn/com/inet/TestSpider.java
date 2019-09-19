package cn.com.inet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestSpider {
    //模拟网络爬虫
    public static void main(String[] args) throws Exception {
//        //获取URL
//        //URL url = new URL("https://www.jd.com");
//        URL url = new URL("https://www.dianping.com");
//        //下载资源
//        HttpURLConnection coon = (HttpURLConnection)url.openConnection();
//        //模拟浏览器的get请求
//        coon.setRequestMethod("GET");
//        coon.setRequestProperty("User-Agent"," Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3314.0 Safari/537.36 SE 2.X MetaSr 1.0");
//        //InputStream is = url.openStream();
//        BufferedReader bf = new BufferedReader(new InputStreamReader(coon.getInputStream(),"UTF-8"));
//        String msg = null;
//        while(null !=(msg = bf.readLine()) ) {
//            System.out.println(msg);
//        }
//        bf.close();
        URL url = new URL("https://www.dianping.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent"," Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3314.0 Safari/537.36 SE 2.X MetaSr 1.0");
        //InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
        String msg = null;
        while((msg = br.readLine()) != null) {
            System.out.println(msg);
        }
        br.close();
    }
}
