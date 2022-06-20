package com.evarion.gui;

import javax.swing.*;
import java.awt.*;

public class TestSplitPanel extends JFrame {
    JSplitPane jSplitPane1 = new JSplitPane();
    JSplitPane jSplitPane2 = new JSplitPane();
    JPanel jPanel12 = new JPanel();
    JPanel jPanel22 = new JPanel();

    TestSplitPanel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(50, 40);
        setMinimumSize(new Dimension(1800, 900));

        //JSplitPane jSplitPane1 = new JSplitPane();
        //JSplitPane jSplitPane2 = new JSplitPane();

        //jSplitPane1.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        //jSplitPane1.setRightComponent(jSplitPane2);
        //jSplitPane2.setOrientation(JSplitPane.VERTICAL_SPLIT);

        add(jSplitPane2);
        add(jSplitPane2);
        jSplitPane1.setTopComponent(jPanel12);
        jSplitPane1.setBottomComponent(jPanel22);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TestSplitPanel frame = new TestSplitPanel();
                frame.setVisible(true);
            }
        });
    }
}
