/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
public class Fibonacci {
public static int Fibo(int n)
{
    int a=0,b=1,sum=0;
    for(int i=1;i<n;i++)
    {
        sum=a+b;
        a=b;
        b=sum;
    }
    return sum;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap =new Scanner(System.in);
        System.out.print("nhap n  ");
        int n=nhap.nextInt();
        if(n==0||n==1)System.out.println(n);
        else System.out.println(Fibo(n));
    }
    
}
