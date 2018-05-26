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
public class pattern1 
{
    public static void main(String[] args) 
    {
        int i,j,k;
        
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                k=i+j-1;
                if(k>4)
                {
                    System.out.print(k-4+" ");
                }
                else
                {
                    System.out.print(k+" ");
                }
            }
            System.out.println("");
        }
    }
}
