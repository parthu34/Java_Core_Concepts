/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number for check:");
        int num = in.nextInt();
        
        int temp,r,sum=0;
        temp = num;
        
        while(num>0)
        {
            r = num%10;
            num=num/10;
            sum=(sum*10)+r; 
        }
        if(sum==temp)
        {
            System.out.println(temp+" is palindrome number.");
        }
        else
        {
            System.out.println(temp+" is not palindrome number.");
        }
    }
}
