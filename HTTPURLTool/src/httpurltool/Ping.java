/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurltool;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class Ping {
     public static void ping(String[] args) throws Exception {
         
         Scanner user_input3 = new Scanner(System.in);        	
       	    String url3;
       	    System.out.println("What website do you want to check?");
       	    url3 = user_input3.nextLine();
       	    
    		URL checkurl3 = new URL(url3);
    		HttpURLConnection http = (HttpURLConnection)checkurl3.openConnection();
    		String statusCode = http.getResponseMessage();
    		
    			System.out.println("The response is " + statusCode);	
     }
}
