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
class test 
{
    void Animal()
    {
        System.out.println("Scream..");
    }
}
class test1 extends test
{
    void Dog()
    {
        System.out.println("Bark..");
    }
}
class test2 extends test
{
    void Cat()
    {
        System.out.println("Meow..");
    }
}


public class Inheritance 
{
    public static void main(String[] args) 
    {
        test2 t = new test2();
        t.Animal();
        //t.Dog();
        t.Cat();
    }
}
