/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg400_level;

import java.util.Scanner;

/**
 *
 * @author Brodie
 */
public class EIE411_Assignment {
    public static void main(String[] args) {
        System.out.println("Please input the number you want converted : ");
        Scanner sc=new Scanner(System.in);
        int no =sc.nextInt();
        
        if(no > 0){
            System.out.println("Binary conversion for "+no+" is : ");
            System.out.println("Using Array : ");
            convertToBinary(no);
        }
    }
    
    
    static void convertToBinary(int no){
        int holder[] = new int [100];
        
        int i =0;
        
        while(no > 0){
            holder[i] = no%2;
            i++;
            no =no/2;
        }
        
        for (int j =i -1 ; j>= 0; j--){
            System.out.println(holder[j]);
        }
    }
}