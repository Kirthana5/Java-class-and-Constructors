/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

/**
 *
 * @author ELCOT
 */
class art
{
    int a=10,b=20,c;
    art()
    {
        c=4;//assigning values
        System.out.println("Inside constructor without arguments:"+(a+b));
    }
    art(int a,int b)//parameterised constructor
    {
       System.out.println("Inside constructor with arguments:"+(a+b)); 
    }
            
}

public class constructorsample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a=10,b=5;
      art obj=new art();
      art obj1=new art(a,b);
      System.out.println("C value:"+obj.c);//default constructor
    }
    
}
