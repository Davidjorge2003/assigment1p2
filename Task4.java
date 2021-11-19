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
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Here we implement the scanner that is going to ask everything
       Scanner myScanner = new Scanner(System.in);
       
       //Here we indentified all the valueswe are going to use
        int h=2;
        int a=60;
        
        //Here we ask for the minutes 
        System.out.println("How many minute have you park?");
        double minutes=myScanner.nextDouble();
        System.out.printf("%-15s: %s\n" , "Parking time(minutes) ",minutes);
        
        //Here we round up the minutes and dived them by 60 (Math.ceil will round up soo if we have less than one hour it will be at least one hour)and print them with printf
        int hour= (int) (Math.ceil(minutes/a));
        System.out.printf("%-22s: %s\n" , "Parking time (hours) ",hour);
        
        //here we alculat the final hour and print them with printf
        int finalpr =(int) (hour*h);
        System.out.printf("%-22s: %s\n" , "Final Price ",finalpr);
    }
    
}
