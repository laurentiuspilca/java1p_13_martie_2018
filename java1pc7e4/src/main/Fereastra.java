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
    private JButton b1,b2,b3,b4,b5;
    
    public Fereastra() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        b1 = new JButton("Buton 1");
        b2 = new JButton("Buton 2");
        b3 = new JButton("Buton 3");
        b4 = new JButton("Buton 4");
        b5 = new JButton("Buton 5");
        
        add(b1);add(b2);add(b3);add(b4);add(b5);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
