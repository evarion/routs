package com.evarion.main;


import com.evarion.gui.MainGuiNew1;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGuiNew1 frame = new MainGuiNew1();
                frame.setVisible(true);
            }
        });
    }
}
