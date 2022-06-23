package com.evarion.main;

import com.evarion.gui.MainGui2;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGui2 frame2 = new MainGui2();
                frame2.setVisible(true);
            }
        });


    }
}
