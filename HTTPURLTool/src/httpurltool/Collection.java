/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurltool;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author Mikel
 */
public class Collection {

    public static void collection(String[] args) throws Exception {

        // Tree and set
        TreeSet treeSet = new TreeSet();

        treeSet.add("This will not be shown");
        treeSet.add("http://facebook.com");
        treeSet.add("http://yahoo.com");

        treeSet.remove("This will not be shown");
        System.out.println(treeSet);

        //Map
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "http://mbutterfield.com");
        hashMap.put(2, "http://google.com");

        System.out.println(hashMap);

        //List
        LinkedList linkedList = new LinkedList();

        linkedList.add("http://ebay.com");
        linkedList.add("http://amazon.com");
        linkedList.add("This will be removed");

        linkedList.remove("This will be removed");
        System.out.println(linkedList);

    }
    
}
