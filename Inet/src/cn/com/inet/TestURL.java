package cn.com.inet;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
    //URL由4部分组成  1 协议 2 域名 3 端口号 4 资源文件名
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.baidu.com:80/index.html?uname=shsxt&age=傻逼#a");
        //获取四个值
        System.out.println("协议："+url.getProtocol());
        System.out.println("域名或者ip:"+url.getHost());
        System.out.println("端口："+url.getPort());
        System.out.println("请求资源1："+url.getFile());
        System.out.println("请求资源2："+url.getPath());
        //参数
        System.out.println("参数："+url.getQuery());
        //锚点
        System.out.println("锚点："+url.getRef());
    }
}
