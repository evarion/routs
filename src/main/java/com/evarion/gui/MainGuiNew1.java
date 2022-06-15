package com.evarion.gui;


import javax.swing.*;
import java.awt.*;


public class MainGuiNew1 extends JFrame {


    JPanel jPanelLeft = new JPanel();
    JPanel jPanelCentre = new JPanel();
    JPanel jPanelRight = new JPanel();
    JPanel jPanelData = new JPanel();
    JPanel jPanelRightDataUp = new JPanel();
    JPanel jPanelRightDataDown = new JPanel();
    JPanel jPanelDownPanelInfo = new JPanel();


    public MainGuiNew1() {
        super("App");
        createGUI();
    }

    public void createGUI() {
        //MainPanel.createPanel();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setLocation(50, 40);
        setMinimumSize(new Dimension(1800, 900));
        addPanel();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);

    }


    public void addPanel() {

        setLayout(new GridBagLayout());


        GridBagConstraints constraints1 = new GridBagConstraints();

        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.gridheight = 5;
        constraints1.gridwidth = 1;
        jPanelLeft.setPreferredSize(new Dimension(90, 680));
        jPanelLeft.setBackground(Color.ORANGE);
        add(jPanelLeft, constraints1);



        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 1;
        constraints1.gridy = 0;
        constraints1.gridheight = 1;
        constraints1.gridwidth = 1;
        jPanelCentre.setPreferredSize(new Dimension(900, 100));
        jPanelCentre.setBackground(Color.green);
        add(jPanelCentre, constraints1);


        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 2;
        constraints1.gridy = 0;
        constraints1.gridheight = 1;
        constraints1.gridwidth = 1;
        jPanelRight.setPreferredSize(new Dimension(500, 100));
        jPanelRight.setBackground(Color.BLUE);
        add(jPanelRight, constraints1);


        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 1;
        constraints1.gridy = 2;
        constraints1.gridheight = 2;
        constraints1.gridwidth = 1;
        jPanelData.setPreferredSize(new Dimension(900, 500));
        jPanelData.setBackground(Color.MAGENTA);
        add(jPanelData, constraints1);

        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 2;
        constraints1.gridy = 2;
        constraints1.gridheight = 1;
        constraints1.gridwidth = 1;
        jPanelRightDataUp.setPreferredSize(new Dimension(500, 250));
        jPanelRightDataUp.setBackground(Color.cyan);
        add(jPanelRightDataUp, constraints1);

        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 2;
        constraints1.gridy = 3;
        constraints1.gridheight = 1;
        constraints1.gridwidth = 1;
        jPanelRightDataDown.setPreferredSize(new Dimension(500, 250));
        jPanelRightDataDown.setBackground(Color.RED);
        add(jPanelRightDataDown, constraints1);

        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 1;
        constraints1.gridy = 4;
        constraints1.gridheight = 0;
        constraints1.gridwidth = 2;
        jPanelDownPanelInfo.setPreferredSize(new Dimension(1400, 80));
        jPanelDownPanelInfo.setBackground(Color.YELLOW);
        add(jPanelDownPanelInfo, constraints1);

    }


}
