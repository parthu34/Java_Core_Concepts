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
public class pattern4 
{
    public static void main(String[] args) 
    {
        int i=5;
        while(i>=1)
        {
            int j=5;
            while(j>=i)
            {
                System.out.print(j);
                j--;
            }
            i--;
            System.out.println("");
        }
    }
}
