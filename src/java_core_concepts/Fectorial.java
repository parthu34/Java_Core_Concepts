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
public class Fectorial 
{
    public static void main(String[] args) {
            int i,fact=1;
    int n=5;
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
        System.out.println(n+" fectorial is: "+fact);
    }
}
