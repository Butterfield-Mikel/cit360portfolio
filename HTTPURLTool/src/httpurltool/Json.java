/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurltool;

import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONObject;

/**
 *
 * @author Mikel
 */
public class Json {
    public static void json(String[] args) throws Exception {
        
    Scanner user_input4 = new Scanner(System.in);        	
       	    String url4;
       	    System.out.println("What website do you want serialized data from?");
       	    url4 = user_input4.nextLine();
       	    
       	    String jsonurl = url4;
       	    
       	 URL showurl4 = new URL(url4);
        	String host4 = showurl4.getHost();
        	InetAddress address4 = InetAddress.getByName(host4);
        	String ip4 = address4.getHostAddress();
             
       	    
       	    String jsonip = ip4;
       	    
       	 URL checkurl4 = new URL(url4);
 		HttpURLConnection http4 = (HttpURLConnection)checkurl4.openConnection();
 		String statusCode4 = http4.getResponseMessage();
       	    
       	    String jsonresponse = statusCode4;

      	  JSONObject obj = new JSONObject();

            obj.put("URL", jsonurl);
            obj.put("IPaddress", jsonip);
            obj.put("HTTPresponse", jsonresponse);

            System.out.print(obj);
    }
    
}
