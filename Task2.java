/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Here we implement the scanner that is going to ask everything
        Scanner Input =new Scanner(System.in);

        //Here we are asking for the birth year
        System.out.println("plese input a brith year");
        String birthYear= Input.nextLine();
        
        //Here we print the birth year in printf 
        System.out.printf("%-25s: %s\n" , "The Birth Year is ",birthYear);
        
        //Here we get the birth year and we  subtract the first numbers and then we add 1 
        String century=birthYear.substring(0,2);
        int fCentury=Integer.parseInt(century)+1;
        
        //Here we print the century whit printf
         System.out.printf("%-25s: %s\n" , "The Century is ",fCentury);
         
         //herewe substract the 3 number and it ads a 0 
         String decade=birthYear.substring(2,3)+0;
         int fDecade=Integer.parseInt(decade);
        
         //Here we print he decade whit printf
         System.out.printf("%-25s: %s\n" , "The Decade is ",fDecade);
    }
    
}
