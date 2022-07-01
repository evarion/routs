package com.evarion.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionButtonListeners {
    static class ChangeEventActionFromAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (MainGuiLevel0.control == 0) {
                MainGuiLevel0.dataPanel.createDataVar0(MainGuiLevel0.dataCentreJP0);
                MainGuiLevel0.control = 1;

            } else {
                MainGuiLevel0.dataPanel.createDataVar1(MainGuiLevel0.dataCentreJP0);
                MainGuiLevel0.control = 0;
                System.out.println(MainGuiLevel0.control);
            }
            MainGuiLevel0.mainPanel.updateUI();
        }
    }

    static class TestButtonFromAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("test");
        }
    }


}
