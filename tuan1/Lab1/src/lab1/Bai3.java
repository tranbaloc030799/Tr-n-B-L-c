/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai3 {
    public static void main(String[] args) {
        double Canh,theTichlapPhuong ;
        Scanner baLoc =new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh ");
        Canh =baLoc.nextDouble();
        theTichlapPhuong=(Canh*Canh*Canh);
        System.out.println("Thể Tích Khối Lập Phương Là "+theTichlapPhuong);
    }
    
}
