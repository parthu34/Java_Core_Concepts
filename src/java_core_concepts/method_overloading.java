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
class M
{
    int add(int a, int b)
    {
       return a+b; 
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class method_overloading 
{
    
    public static void main(String[] args) 
    {
        M m = new M();
        System.out.println(m.add(1, 2));
        System.out.println(m.add(2, 5, 7));
    }
}
