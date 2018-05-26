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
class Student
{
    int id;
    String name;
    float fees;
    
    void data(int id, String name, float fees)
    {
        this.id=id;
        this.name=name;
        this.fees=fees;
        
        System.out.println(id+" "+name+" "+fees);
    }
}

public class this_keyword 
{
    public static void main(String[] args) {
        Student s= new Student();
        Student s1= new Student();
        s.data(1,"Parth",50000f);
        s1.data(2,"Manish", 677777f);
        
    }
}
