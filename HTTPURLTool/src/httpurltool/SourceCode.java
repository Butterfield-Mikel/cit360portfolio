/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurltool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class SourceCode {
    public static void sourceCode(String[] args) throws Exception {
        Scanner user_input = new Scanner(System.in);

                String url;
                System.out.println("What website's code do you want to see? ");
                url = user_input.nextLine();

                URL userURL = new URL(url);
                URLConnection myConnection = userURL.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        myConnection.getInputStream()));

                String siteCode;
                while ((siteCode = in.readLine()) != null) {
                    System.out.println(siteCode);
                }
                in.close();
    }
}
