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
public class Bai1 {
    public static void main(String[] args) {
        String hoTen;
        Scanner baloc =new Scanner(System.in);
        
        System.out.println("Nhập Họ Và Tên:");
         hoTen = baloc.nextLine();
        
        System.out.println("Nhập Điểm TB ");
        double diemTB=baloc.nextDouble();
        System.out.println("Tên đã nhập là "+hoTen+" Điểm Trung Bình là "+diemTB);
    }
}
