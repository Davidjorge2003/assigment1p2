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
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Here we implement the scanner that is going to ask everything
      Scanner myScanner = new Scanner(System.in);
         
        Scanner Input =new Scanner(System.in);

        //Here we ask for 5 numbers whit space
        System.out.println("input 5 numbers");
        String Number= Input.nextLine();
        
        //here we get number1
        String Number1=Number.substring(0,1);
         int number1=Integer.parseInt(Number1);
         
         //here we get number2
          String Number2=Number.substring(2,3);
         int number2=Integer.parseInt(Number2);
         
         //here we get number3
         String Number3=Number.substring(4,5);
         int number3=Integer.parseInt(Number3);
         
         //Here we get number4
         String Number4=Number.substring(6,7);
         int number4=Integer.parseInt(Number4);
         
         //Here we get number5
         String Number5=Number.substring(8,9);
         int number5=Integer.parseInt(Number5);
         
         //Here we print the numbers we first implemented 
          System.out.printf("%-30s: %2.2f %2.2f %2.2f %2.2f %2.2f\n" , "The number are ",(double)number1,+(double)number2,+(double)number3,+(double)number4,+(double)number5);
          
          //Here we add the numbers and dived then by 5 to get the mean
         double mean=(double)(number1+number2+number3+number4+number5)/5;
            System.out.printf("%-30s: %2.2f\n" , "The mean number is ",mean);
        
         //Here we check which is the Maximum number and is is number1 then we will print that number   
         if (number1>number2&&number1>number3&&number1>number4&&number1>number5) {
            System.out.printf("%-30s: %2.2f\n" , "The Maximum Number is ",(double)number1);
         } 
         
         //Here we check which is the Maximum number and is is number2 then we will print that number
         if (number2>number1&&number2>number3&&number2>number4&&number2>number5) {
            System.out.printf("%-30s: %2.2f\n" , "The Maximum Number Is ",(double)number2);
         } 
         
         //Here we check which is the Maximum number and is is number3 then we will print that number
         if (number3>number1&&number3>number2&&number3>number4&&number3>number5) {
            System.out.printf("%-30s: %2.2f\n" , "The Maximum Number Is ",(double)number3);
         }  
         
         //Here we check which is the Maximum number and is is number4 then we will print that number
         if (number4>number1&&number4>number3&&number4>number2&&number4>number5) {
           System.out.printf("%-30s: %2.2f\n" , "The Maximum Number Is ",(double)number4);
         }  
         
         //Here we check which is the Maximum number and is is number5 then we will print that number
         if (number5>number2&&number5>number3&&number5>number4&&number5>number1) {
            System.out.printf("%-30s: %2.2f\n" , "The Maximum Number Is ",(double)number5);
            
            
         }
         
          //Here we check which is the Minimum number and is is number1 then we will print that number
         if (number1<number2&&number1<number3&&number1<number4&&number1<number5) {
            System.out.printf("%-30s: %2.2f\n" , "The Minimum Number Is ",(double)number1);
         } 
         
          //Here we check which is the Minimum number and is is number1 then we will print that number
         if (number2<number1&&number2<number3&&number2<number4&&number2<number5) {
           System.out.printf("%-30s: %2.2f\n" , "The Minimum Number Is ",(double)number2); 
         }
         
          //Here we check which is the Minimum number and is is number1 then we will print that number
         if (number3<number2&&number3<number1&&number3<number4&&number3<number5) {
            System.out.printf("%-30s: %2.2f\n" , "The Minimum Number Is ",(double)number3); 
         }
         
          //Here we check which is the Minimum number and is is number1 then we will print that number
         if (number4<number2&&number4<number3&&number4<number1&&number4<number5) {
            System.out.printf("%-30s: %2.2f\n" , "The Minimum Number Is ",(double)number4);   
         }
         
          //Here we check which is the Minimum number and is is number1 then we will print that number
         if (number5<number2&&number5<number3&&number5<number4&&number5<number1) {
            System.out.printf("%-30s: %2.2f\n" , "The Minimum Number Is ",(double)number5); 
         }
         
         //Here we calculate the standar Derivation
        double standar1= (Math.pow(number1-mean,2));
        double standar2= (Math.pow(number2-mean,2));
        double standar3= (Math.pow(number3-mean,2));
        double standar4= (Math.pow(number4-mean,2));
        double standar5= (Math.pow(number5-mean,2));
        double finalStandar=Math.sqrt((standar1+standar2+standar3+standar4+standar5)/5);
        System.out.printf("%-30s: %2.2f\n" , "The The Standar Derivation Is ",finalStandar);
    }
    
}
