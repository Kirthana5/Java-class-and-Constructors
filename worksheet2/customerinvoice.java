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
class customer
{
    int id,dis;
    String name;
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        dis=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdiscount()
    {
        return dis;
    }
    void setdiscount(int d1)
    {
        dis=d1;
    }
    public String toString()
    {
        return ("Name: "+name+"\nID: "+id+"\nDiscount %: "+dis);
    }
}
class invoice
{
    int id;
    customer cus;
    double amt;
    invoice(int i,customer cus1,double a)
    {
        id=i;
        cus=cus1;
        amt=a;
    }
    int getid()
    {
        return id;
    }
    customer getcustomer()
    {
        return cus;
    }
    void setcustomer(customer cus2)
    {
        cus=cus2;
    }
    double getamount()
    {
        return amt;
    }
    void setamount(double a1)
    {
        amt=a1;
    }
    String getcustomername()
    {
        return cus.name;
    }
    double getamountafterdiscount()
    {
        return amt-((amt*cus.dis)/100);
    }
    public String toString()
    {
        return ("ID:"+id+"\nCustomer details:"+cus+"\nAmount:"+amt+"\nAmount after discount:"+(getamountafterdiscount()));
    }
} 
public class customerinvoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //1st object of customer class
        customer c1=new customer(101,"Riya",10);
        System.out.println("Customer 1:\nEntered data:");
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        System.out.println("Changing discount......");
        c1.setdiscount(20);
        System.out.println("Discount after changing: "+(c1.getdiscount()));
        System.out.println("\n============");
        System.out.println(c1.toString());
        System.out.println("\n============");
        
        
        //2nd object of customer class
        customer c2=new customer(201,"Kavi",15);
        System.out.println("Customer 2:\nEntered data:");
        System.out.println(c2.getname());
        System.out.println(c2.getid());
        System.out.println(c2.getdiscount());
        System.out.println("Changing discount......");
        c2.setdiscount(25);
        System.out.println("Discount after changing: "+(c2.getdiscount()));
        System.out.println("\n============");
        System.out.println(c2.toString());
        System.out.println("\n============");
        
        
        //1st object of invoice class
        invoice in1=new invoice(110,c1,5000);
        customer c3=new customer(305,"Kirthu",30);
        System.out.println("Invoice 1:\nEntered data:");
        System.out.println("ID:"+(in1.getid()));
        System.out.println(in1.getcustomer());
        System.out.println("Changing customer details:");
        in1.setcustomer(c3);
        System.out.println("After changing customer:\n"+(in1.getcustomer()));
        System.out.println("Amount: Rs."+(in1.getamount()));
        System.out.println("Changing amount......");
        in1.setamount(10000);
        System.out.println("Amount after changing: Rs."+(in1.getamount()));
        System.out.println("Name:"+(in1.getcustomername()));
        System.out.println("Amount after discount: "+(in1.getamountafterdiscount()));
        System.out.println("\n============");
        System.out.println(in1.toString());
        System.out.println("\n============");
        
        
        //2nd object of invoice class
        invoice in2=new invoice(220,c2,3000);
        customer c4=new customer(505,"Keerthu",50);
        System.out.println("Invoice 2:\nEntered data:");
        System.out.println("ID:"+(in2.getid()));
        System.out.println(in2.getcustomer());
        System.out.println("Changing customer details........");
        in1.setcustomer(c4);
        System.out.println("CAfter changing customer:\n"+(in2.getcustomer()));
        System.out.println("Amount: Rs."+(in2.getamount()));
        System.out.println("Changing amount......");
        in1.setamount(6000);
        System.out.println("Amount after changing: Rs."+(in2.getamount()));
        System.out.println("Name:"+(in2.getcustomername()));
        System.out.println("Amount after discount: "+(in2.getamountafterdiscount()));
        System.out.println("\n============");
        System.out.println(in2.toString());
        System.out.println("\n============");
    }
    
}
