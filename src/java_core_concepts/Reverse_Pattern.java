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
public class Reverse_Pattern 
{
    public static void main(String[] args) 
    {
        int i,j,k,n=5;
        for(i=1;i<=n;i++)
        {
            for(k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            
            for(j=1;j<=i;j++)
            {
                System.out.print(j+"");
            }
            System.out.println("");
        }
    }
}
