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
class A
{
    String Name="Parth";
    static String country="USA";
    static void Change()
    {
        country = "INDIA";
    }
    void display()
    {
        System.out.println(Name+" is lives in "+country);
    }
}

public class Static_Example 
{
    public static void main(String[] args) 
    {
        A.Change();
      
        A a = new A();
        a.display();
    }
}
