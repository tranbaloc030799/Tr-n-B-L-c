/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author ASUS
 */
public class Bai4 {
    public static void main(String[] args) {
        double a,b,c,Delta,x ;
        Scanner baLoc =new Scanner(System.in);
        System.out.println("Nhập số a ");
        a=baLoc.nextDouble();
        System.out.println("Nhập số b ");
        b=baLoc.nextDouble();
        System.out.println("Nhập số c ");
        c=baLoc.nextDouble();
        Delta=Math.pow(b, 2)-4*a*c;
        x=Math.sqrt(Delta);
        System.out.println("Delta "+Delta);
        System.out.println("Căng Delta "+x);
        
    }
    
}
