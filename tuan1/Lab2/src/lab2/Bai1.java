/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai1 {
    public static void main(String[] args) {
        double a,b,x;
        Scanner baLoc =new Scanner(System.in);
        System.out.println("Nhập giá trị a của phương trình bậc nhất: ");
        a= baLoc.nextDouble();
        System.out.println("Nhập giá trị b của phương trình bậc hai: ");
        b= baLoc.nextDouble();
        
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình có vô số nghiệm !");
                
            } 
            else {
                System.out.println("Phương trình vô nghiệm !");
            }
            
        } 
        else {
            x=-b/a;
            System.out.println("Nghiệm của phương trình là : "+x);
        }
    }
}
        
   