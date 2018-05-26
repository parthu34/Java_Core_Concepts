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
public class Table 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Number: ");
        int num1 = in.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(num1+ " * "+i+" = "+(num1*i));
        }
    }
}
