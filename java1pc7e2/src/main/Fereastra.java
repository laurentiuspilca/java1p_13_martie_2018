/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Fereastra extends JFrame {
    
    private JButton buton;
    
    public Fereastra() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("TITLU");
        
        buton = new JButton("HELLO");
        this.add(buton);
        buton.addActionListener(ev -> schimbaText());
        
        this.setLocation(150, 150);
        this.setSize(500, 500);
        this.setVisible(true);
    }
    
    private void schimbaText() {
        if (buton.getText().equals("HELLO")) {
            buton.setText("WORLD");
        } else {
            buton.setText("HELLO");
        }
    }
}
