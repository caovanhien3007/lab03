/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln;
import java.util.Scanner;
/**
 *
 * @author user56
 */
public class Ucln {

   public static int ln(int x, int y) {
       if(x==0||y==0)return x+y;
        if(x==y)return x;
        else 
        {
            if(x>y)return ln(y,x%y);
            if(y>x)return ln(x,y%x);
        }
return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner nhap =new Scanner(System.in);
       System.out.print("nhap a  ");
        int a=nhap.nextInt();
        System.out.print("nhap b  ");
        int b=nhap.nextInt();
        if(a<0||b<0)
            System.out.println("a va b khong co UCLN");
        else
        {
            System.out.println("UCLN cua a va b la ");
            System.out.println(ln(a,b));
        }
    }
    
}
