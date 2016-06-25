/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurltool;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class SocketIO {

    public static void socket(String[] args) throws Exception {
       
         Scanner user_input6 = new Scanner(System.in); 
          String url6;
                System.out.println("What website do you want to connect to? ");
                url6 = user_input6.nextLine();

                URL showurl6 = new URL(url6);
                String host = showurl6.getHost();
                InetAddress address = InetAddress.getByName(host);
                String ip = address.getHostAddress();
                
                
       
        try {
            InetAddress addr
                    = InetAddress.getByName(ip);
            Socket theSocket = new Socket(addr, 80);
            System.out.println("You have connected to "
                    + url6 + " IP address: "
                    + theSocket.getInetAddress()
                    + " on port " + theSocket.getPort() + " from port "
                    + theSocket.getLocalPort() + " of "
                    + theSocket.getLocalAddress());
        } catch (UnknownHostException e) {
            System.err.println("I can't find " + e);
        } catch (SocketException e) {
            System.err.println("Could not connect to " + e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
