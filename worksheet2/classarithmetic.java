/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.*;
/**
 *
 * @author ELCOT
 */
class arithmetic
{
    float a,b;
    void add(float a,float b)
    {
       System.out.println(""+a+"+"+b+"="+(a+b));
    }
    void sub(float a,float b)
    {
        System.out.println(""+a+"-"+b+"="+(a-b));
    }
    void mul(float a,float b)
    {
        System.out.println(""+a+"*"+b+"="+(a*b));
    }
    void div(float a,float b)
    {
        System.out.println(""+a+"/"+b+"="+(a/b));
    }
}
public class classarithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arithmetic obj1=new arithmetic();
        arithmetic obj2=new arithmetic();
        arithmetic obj3=new arithmetic();
        Scanner val=new Scanner(System.in);
        
        
        //1st object
        System.out.println("Enter values of a and b:");
        obj1.a=val.nextFloat();
        obj1.b=val.nextFloat();
        obj1.add(obj1.a,obj1.b);
        obj1.sub(obj1.a,obj1.b);
        obj1.mul(obj1.a,obj1.b);
        obj1.div(obj1.a,obj1.b);
        
        
        //2nd object
        System.out.println("Enter values of a and b:");
        obj2.a=val.nextFloat();
        obj2.b=val.nextFloat();
        obj2.add(obj2.a,obj2.b);
        obj2.sub(obj2.a,obj2.b);
        obj2.mul(obj2.a,obj2.b);
        obj2.div(obj2.a,obj2.b);
        
        
        //3rd object
        System.out.println("Enter values of a and b:");
        obj3.a=val.nextFloat();
        obj3.b=val.nextFloat();
        obj3.add(obj3.a,obj3.b);
        obj3.sub(obj3.a,obj3.b);
        obj3.mul(obj3.a,obj3.b);
        obj3.div(obj3.a,obj3.b);
    
    }
    
}
