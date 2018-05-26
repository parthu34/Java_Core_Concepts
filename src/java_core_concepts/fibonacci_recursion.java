/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core_concepts;

/**
 *
 * @author Dell
 */
public class fibonacci_recursion 
{
    static int n1=0,n2=1,n3=0;
    static void printFibo(int n)
    {
        if(n>0)
        {
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(n3+" ");
        printFibo(n-1);
        }
    }
    public static void main(String[] args) 
    {
        int n=10;
        System.out.print(n1+" "+n2+" ");
        printFibo(n-2);
    }
}
