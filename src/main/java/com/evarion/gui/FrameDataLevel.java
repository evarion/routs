package com.evarion.gui;

import javax.swing.*;
import java.awt.*;

public class FrameDataLevel extends JFrame {
    JPanel mainData = new JPanel();
    JPanel rightData = new JPanel();
    JPanel leftData = new JPanel();
    JPanel leftDataMenu = new JPanel();
    JPanel leftDataField = new JPanel();

    static JPanel rightDataMenu = new JPanel();
    JPanel rightDataField = new JPanel();

    static JButton [] buttonsRightDataMenu = new JButton[8];

    public void createDataVar0(JPanel jPanel) {
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
        createLeftData();
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
        createLeftData();
        mainData.add(leftData, constraints);

        rightData.setBackground(Color.LIGHT_GRAY);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 0.25;
        constraints.weighty = 1.0;
        createRightData();
        mainData.add(rightData, constraints);

        jPanel.setLayout(new GridBagLayout());
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        jPanel.add(mainData, constraints);
    }

    public void createLeftData() {
        leftData.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

        leftDataMenu.setBackground(Color.darkGray);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 0.03;
        leftData.add(leftDataMenu, constraints);

        leftDataField.setBackground(Color.WHITE);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.97;
        leftData.add(leftDataField, constraints);

    }

    public void createRightData() {
        rightData.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

        rightDataMenu.setBackground(Color.orange);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 0.03;

        rightData.add(rightDataMenu, constraints);

        rightDataField.setBackground(Color.LIGHT_GRAY);
        constraints.gridx=0;
        constraints.gridy=1;
        constraints.weightx=1.0;
        constraints.weighty=0.97;

        rightData.add(rightDataField,constraints);
    }
    public static void addButtonRightDataMenu(){
        rightDataMenu.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        JPanel jPanelEmpty = new JPanel();
        constraints.anchor = GridBagConstraints.WEST;

        for (int i = 0; i < buttonsRightDataMenu.length; i++) {
            buttonsRightDataMenu[i] = new JButton();
            buttonsRightDataMenu[i].setName("jButtonRightMenuTop" + i);
            buttonsRightDataMenu[i].setPreferredSize(new Dimension(20, 20));
            buttonsRightDataMenu[i].setMinimumSize(new Dimension(20, 20));
            //actionsButtonsTopPanel(i);
        }


        for (JButton jButton : buttonsRightDataMenu) {

            constraints.gridwidth = 1;
            constraints.gridy = 0;

                constraints.insets.left = 5;
                constraints.insets.right = 5;
                constraints.insets.top=1;
                constraints.insets.bottom=1;

            rightDataMenu.add(jButton, constraints);
        }
        constraints.weightx = 0.001;
        //jPanelEmpty.setBackground(Color.ORANGE);
        //rightDataMenu.add(jPanelEmpty, constraints);
    }
}
