package cn.com.inet;

import java.net.InetSocketAddress;

public class TestPort {
    //new InetSocketAddress(地址或者域名，端口)
    //方法
    //getAddress() getPort() getHostName()
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress address1 = new InetSocketAddress("localhost",6555);
        System.out.println(address.getHostName());
        System.out.println(address.getAddress());
        System.out.println(address1.getAddress());
        System.out.println(address.getPort());
        System.out.println(address1.getPort());
    }
}
