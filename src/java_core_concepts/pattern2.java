/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core_concepts;

/**
 *
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 * @author Dell
 */
public class pattern2 
{
    public static void main(String[] args) 
    {
        int i,j;
        
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print(" 1 ");
                }
            }
            System.out.println("");
        }
    }
}
