package cn.com.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {
    //InetAddress:  提供多个静态方法
    //getLocalHost:得到本机
    //getByName:根据域名dns ip地址
    //两个成员方法
    //getHostAddress:返回地址
    //getHostName:返回计算机名
    public static void main(String[] args) throws UnknownHostException {
        //使用getLocalHost()方法创建InetAddress对象
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostAddress());//本机的IP地址
        System.out.println(address.getHostName());//本机计算机名

        //根据域名得到InetAddress对象
        address = InetAddress.getByName("www.shsxt.com");
        System.out.println(address.getHostAddress());//返回163服务器的ip地址
        System.out.println(address.getHostName());//输出www.163.com

        //根据ip得到netAddress对象
        address = InetAddress.getByName("123.56.138.186");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
    }
}
