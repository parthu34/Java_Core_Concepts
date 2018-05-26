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
public class Even_Odd 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = in.nextInt();
        
        if(n%2==0)
        {
            System.out.println(n+" is even number.");
        }
        else
        {
            System.out.println(n+ " is odd number.");
        }
    }
}
