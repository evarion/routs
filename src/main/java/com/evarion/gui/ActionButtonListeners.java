package com.evarion.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionButtonListeners {
    static class ChangeEventActionFromAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (FrameMainLevel.control == 0) {
                FrameMainLevel.dataPanel.createDataVar0(FrameMainLevel.dataCentreJP0);
                FrameMainLevel.control = 1;

            } else {
                FrameMainLevel.dataPanel.createDataVar1(FrameMainLevel.dataCentreJP0);
                FrameMainLevel.control = 0;
                System.out.println(FrameMainLevel.control);
            }
            FrameMainLevel.mainPanel.updateUI();
        }
    }

    static class TestButtonFromAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("test");
        }
    }


}
