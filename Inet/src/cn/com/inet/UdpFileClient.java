package cn.com.inet;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpFileClient {
    //文件上传  发送端
    public static void main(String[] args) throws IOException {
        System.out.println("发送方启动中。。。");
//        DatagramSocket client = new DatagramSocket(8888);
//
//        byte[] datas = IOUtiles.fileToByteArray("F:/java code/Inet/logo.png");
//        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
//        client.send(packet);
//        client.close();
        DatagramSocket client = new DatagramSocket(8888);
        byte[] datas = IOUtiles.fileToByteArray("F:/java code/Inet/logo.png");
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
        client.send(packet);
        client.close();
    }
}
