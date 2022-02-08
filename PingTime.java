package Ping;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class PingTime{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the website");
        String host=scanner.nextLine();
        System.out.println("please enter number of times to ping");
        int num= scanner.nextInt();
        try {
            String hostAddress = host;
            int port = 80;
            int timeToRespond = 0;

            InetAddress inetAddress = InetAddress.getByName(hostAddress);
            InetSocketAddress socketAddress = new InetSocketAddress(inetAddress, port);
            int arr[]=new int[num];

            while(num>0) {
                SocketChannel sc = SocketChannel.open();
                sc.configureBlocking(true);
                Date start = new Date();
                if (sc.connect(socketAddress)) {
                    Date stop = new Date();
                    timeToRespond = (int) (stop.getTime() - start.getTime());
                }

                System.out.println("Response time: " + timeToRespond + " ms");
                num--;
                arr[num]=timeToRespond;
            }
            Arrays.sort(arr);
            int index=arr.length;
            if(index%2==0){
                System.out.println("the median time is :" +((arr[(index/2)]+arr[(index/2)-1])/2));
            }
            else{
            System.out.println("the median time is :"+arr[index/2]);}
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}