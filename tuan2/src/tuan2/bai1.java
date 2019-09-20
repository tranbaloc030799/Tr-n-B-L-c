/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class bai1 extends JFrame {
    public bai1 (){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
            public static void main(String[] args) {
        bai1 JPanel= new bai1();
       JPanel.setSize(400,300);
       JPanel.setLocationRelativeTo(null);
       JPanel.setVisible(true);
    }
    
}
