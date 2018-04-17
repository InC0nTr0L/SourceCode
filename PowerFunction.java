/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahome;

import java.io.*;
import java.util.*;

public class PowerFunction {

public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    int x,n,d;
    System.out.println("Enter x :");
    x=scan.nextInt();
    System.out.println("Enter n :");
    n=scan.nextInt();
    System.out.println("Enter d :");
    d=scan.nextInt();
    power(x, n, d);    
}

public static void power(int x, int n, int d)
{
    int result,p=x,i;
    if(n==0)
        p=0;
    else if(n==1)
        p=x;
    else
    {
        p=x;
        for(i=2;i<=n;i++)
        {            
            p=p*x;       
            //System.out.println(p);
        }
    }
    result=(((p%d)+d)%d);
    System.out.println(result);
}

}
