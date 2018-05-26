/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core_concepts;

/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/
/**
 *
 * @author Dell
 */
public class pattern3 
{
    public static void main(String[] args) 
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
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
