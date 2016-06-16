/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurltool;

import java.net.InetAddress;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class IP {
     public static void ip(String[] args) throws Exception {
         Scanner user_input2 = new Scanner(System.in);

                String url2;
                System.out.println("What website's ip address do you want to see? ");
                url2 = user_input2.nextLine();

                URL showurl2 = new URL(url2);
                String host = showurl2.getHost();
                InetAddress address = InetAddress.getByName(host);
                String ip = address.getHostAddress();
                System.out.println(ip);
     }
}
