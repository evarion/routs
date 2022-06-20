package com.evarion.main;


import com.evarion.gui.MainGui;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGui frame = new MainGui();
                frame.setVisible(true);
            }
        });
    }
}
