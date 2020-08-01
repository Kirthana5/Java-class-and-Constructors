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
class boxvol
{
    int height,depth,width;
    void volume()
    {
        int vol=height*depth*width;
        System.out.println("Volume of the box is: "+vol);
    }
}
        
public class classvolume2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        
        //1st object
        boxvol obj1=new boxvol();
        System.out.println("Box 1:");
        System.out.println("Enter height:");
        obj1.height=val.nextInt();
        System.out.println("Enter depth:");
        obj1.depth=val.nextInt();
        System.out.println("Enter width:");
        obj1.width=val.nextInt();
        obj1.volume();
        System.out.println("\n============");
        
        //2nd object
        boxvol obj2=new boxvol();
        System.out.println("Box 2:");
        System.out.println("Enter height:");
        obj2.height=val.nextInt();
        System.out.println("Enter depth:");
        obj2.depth=val.nextInt();
        System.out.println("Enter width:");
        obj2.width=val.nextInt();
        obj2.volume();
    }
    
}
