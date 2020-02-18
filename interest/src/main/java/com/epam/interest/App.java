package com.epam.interest;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);
        System.out.println("1.Simple Interest\n2.Compound Interest\n3.House Construction Cost : ");
        int option=in.nextInt();
        while(option<1 || option>3) {
        	System.out.println("Entered invalid option\n");
        	option=in.nextInt();
        }
        if(option==1) {
        	System.out.println("Enter principal amount : ");
        	double p=in.nextDouble();
        	System.out.println("Enter rate of interest : ");
        	double r=in.nextDouble();
        	System.out.println("Enter time period : ");
        	double t=in.nextDouble();
        	Simple s=new Simple(p,t,r);
        	System.out.println("Simple Interest is : "+s.cal()+"INR");
        }
        else if(option==2) {
        	System.out.println("Enter principal amount : ");
        	double p=in.nextDouble();
        	System.out.println("Enter rate of interest : ");
        	double r=in.nextDouble();
        	System.out.println("Enter time period : ");
        	double t=in.nextDouble();
        	Compound c=new Compound(p,t,r);
        	System.out.println("Compound Interest is : "+c.cal()+"INR");
        }
        else {
        	System.out.println("Enter area of the house : ");
        	double area=in.nextDouble();
        	System.out.println("Enter materail standard : ");
        	System.out.println("1.Standard material\n2.Above Standard materials\n3.High Standard materials\n4.High standard material and fully automated home");
        	int op=in.nextInt();
        	House h=new House(area,op);
        	System.out.println("Total Cost : "+h.cal()+"INR");
        }
        in.close();
    }
}
