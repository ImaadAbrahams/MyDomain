/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.mycput.jdbcuniapp;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author imaad
 */
public class Main {
    public static void main(String[] args){
        AppGui gui = new AppGui();
        gui.setSize(800, 600);
        gui.setVisible(true);
        gui.setAppGui();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
