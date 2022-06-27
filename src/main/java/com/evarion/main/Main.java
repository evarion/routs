package com.evarion.main;

import com.evarion.gui.MainGuiLevel0;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGuiLevel0 frame2 = new MainGuiLevel0();
                frame2.setVisible(true);
            }
        });
    }
}
