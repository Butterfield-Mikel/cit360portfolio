package httpSandbox;

import java.util.Scanner;
import java.net.*;
import java.io.*;

public class httpSandbox {

    public static void main(String[] args) throws Exception {
    	
    	Scanner user_input = new Scanner(System.in);
    	
   	    String url;
   	    System.out.println("What website's code do you want to see? ");
   	    url = user_input.nextLine();
    	
        URL userURL = new URL(url);
        URLConnection myConnection = userURL.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
        myConnection.getInputStream()));
        
        String siteCode;
        while ((siteCode = in.readLine()) != null) 
        System.out.println(siteCode);
        in.close();

    }
   
}