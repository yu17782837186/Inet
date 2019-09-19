package cn.com.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpFileServer {
    //文件存储 接收端
    public static void main(String[] args) throws IOException {
        System.out.println("接收方启动中。。。");
//        DatagramSocket server = new DatagramSocket(6666);
//        byte[] cintainer = new byte[1024*60];
//        DatagramPacket packet = new DatagramPacket(cintainer,0,cintainer.length);
//        server.receive(packet);
//        byte[] datas = packet.getData();
//        //int len = packet.getLength();
//        IOUtiles.byteArrayToFile(datas,"src/copy.png");
//        server.close();
        DatagramSocket server = new DatagramSocket(6666);
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length,new InetSocketAddress("localhost",6666));
        server.receive(packet);
        byte[] datas = packet.getData();
        IOUtiles.byteArrayToFile(datas,"F:/java code/Inet/copy.png");
        server.close();
    }
}
