/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author davic
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //here we implement the scanner that will ask for the data that we need 
        Scanner Input =new Scanner(System.in);

        //here we ask for the web address that we are going to use(the lower case is tomake every later to lower case)
        System.out.println("Please input a web address: ");
        String address = Input.nextLine().toLowerCase();
  

        //here we indentified the 2 dots the website is going to have if the website have 3 dots then we will have to add another one in the middle call boody 
        double dot1 = address.indexOf('.');
        double dot2 = address.lastIndexOf('.');


        //here we are substracting the adress the first part will substract form character 0 to the first dot the "body"will substract from first dot +1 to dot number 2 the (+1 is to not implement the first dot) and the last part will substract from dot2 +1 to the last part
        String firstPart = address.substring(0,(int)dot1);
        String body = address.substring((int)dot1 +1,(int) dot2);
        String lastPart = address.substring((int) (dot2 + 1));
        

        //here we print the address whit printf 
        System.out.printf("%-18s: %s\n" , "The Address is ",address);
        System.out.printf("%-18s: %s\n" , "The Heading is ", firstPart);
        System.out.printf("%-18s: %s\n" , "The Company is ", body);
        System.out.printf("%-18s: %s\n" , "The Extension is ", lastPart);
    }
    
}
