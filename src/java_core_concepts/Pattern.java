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
public class Pattern 
{
    static int i,j;
    static int n = 5;
    public static void main(String[] args) {
        for(i=1;i<n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
                
            }
            System.out.println("");
        }
    }
}
