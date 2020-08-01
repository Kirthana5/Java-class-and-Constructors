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
class box
{
    int height,depth,width;
}
public class classvolume1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        box obj=new box();
        System.out.println("Enter height:");
        obj.height=val.nextInt();
        System.out.println("Enter depth:");
        obj.depth=val.nextInt();
        System.out.println("Enter width:");
        obj.width=val.nextInt();
        int vol=obj.height*obj.depth*obj.width;
        System.out.println("Volume of the box is: "+vol);
        
    }
    
}
