package com.evarion.gui;

import javax.swing.*;
import java.awt.*;

public class MainDataGui extends JFrame {
    JPanel mainData = new JPanel();
    JPanel rightData = new JPanel();
    JPanel leftData = new JPanel();

    public void createDataVar0(JPanel jPanel){
        mainData.remove(leftData);
        mainData.remove(rightData);
        jPanel.remove(mainData);

        mainData.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        leftData.setBackground(Color.WHITE);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        mainData.add(leftData, constraints);

        jPanel.setLayout(new GridBagLayout());
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        jPanel.add(mainData, constraints);
    }

    public void createDataVar1(JPanel jPanel) {
        jPanel.remove(mainData);
        mainData.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

        leftData.setBackground(Color.WHITE);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.75;
        constraints.weighty = 1.0;
        mainData.add(leftData, constraints);

        rightData.setBackground(Color.LIGHT_GRAY);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 0.25;
        constraints.weighty = 1.0;
        mainData.add(rightData, constraints);

        jPanel.setLayout(new GridBagLayout());
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        jPanel.add(mainData, constraints);
    }
}
