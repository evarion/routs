package com.evarion.main;

import com.evarion.gui.FrameMainLevel;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FrameMainLevel frame2 = new FrameMainLevel();
                frame2.setVisible(true);
            }
        });
    }
}
