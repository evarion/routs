package com.evarion.gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainGui extends JFrame {

    JPanel mainPanel = new JPanel();

    JPanel menuLeftJP0 = new JPanel();
    JPanel menuTopJP0 = new JPanel();
    JPanel dataCentreJP0 = new JPanel();
    JPanel menuDownInfoJP0 = new JPanel();

    JPanel jPanelLogo = new JPanel();
    JLabel logo = new JLabel("LOGO");

    JButton[] buttonsLeftMenu = new JButton[8];
    JButton[] buttonsTopMenu = new JButton[25];
    MainDataGui dataPanel = new MainDataGui(); //???
    int control = 1;

    public MainGui() {
        super("App2");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(50, 40);
        setMinimumSize(new Dimension(800, 600));

        createMainPanel();
        createDataPanel();
        createLeftButtonPanel();
        createTopButtonPanel();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void createMainPanel() {
        add(mainPanel);
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.1;//menuTopJP0.setPreferredSize(new Dimension(1920, 40));
        menuTopJP0.setBackground(Color.GRAY);
        mainPanel.add(menuTopJP0, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.weightx = 0.02;
        constraints.weighty = 0.9;  //menuLeftJP0.setPreferredSize(new Dimension(120, 960));
        menuLeftJP0.setBackground(Color.ORANGE);
        mainPanel.add(menuLeftJP0, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.8;
        constraints.weighty = 0.7;//dataCentreJP0.setPreferredSize(new Dimension(1800, 920));
        dataCentreJP0.setBackground(Color.GRAY.brighter());
        mainPanel.add(dataCentreJP0, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.03;//menuDownInfoJP0.setPreferredSize(new Dimension(1800, 40));
        menuDownInfoJP0.setBackground(Color.GRAY);
        mainPanel.add(menuDownInfoJP0, constraints);


    }

    public void createLeftButtonPanel() {
        menuLeftJP0.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.weighty = 0.001;
        constraints.ipady = 30;
        constraints.insets.top = 10;

        logo.setBorder(BorderFactory.createEmptyBorder(35, 0, 0, 0));
        jPanelLogo.setPreferredSize(new Dimension(100, 70));
        jPanelLogo.setMinimumSize(new Dimension(100, 70));

        constraints.gridx = 0;
        constraints.gridy = 1;

        jPanelLogo.add(logo);
        menuLeftJP0.add(jPanelLogo, constraints);
        constraints.insets.top = 2;

        for (int i = 0; i < buttonsLeftMenu.length; i++) {
            buttonsLeftMenu[i] = new JButton();
            buttonsLeftMenu[i].setName("jButtonLeft" + i);
            buttonsLeftMenu[i].setText("Text");
            buttonsLeftMenu[i].setPreferredSize(new Dimension(100, 60));
            buttonsLeftMenu[i].setMinimumSize(new Dimension(60, 20));
        }

        int numY = 2;
        for (JButton jButton : buttonsLeftMenu) {
            constraints.gridy = numY;
            constraints.gridx = 0;
            numY++;
            menuLeftJP0.add(jButton, constraints);
        }
    }


    public void createTopButtonPanel() {
        menuTopJP0.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        JPanel jPanelEmpty = new JPanel();
        constraints.anchor = GridBagConstraints.WEST;

        for (int i = 0; i < buttonsTopMenu.length; i++) {
            buttonsTopMenu[i] = new JButton();
            buttonsTopMenu[i].setName("jButtonTop" + i);
            buttonsTopMenu[i].setPreferredSize(new Dimension(20, 20));
            buttonsTopMenu[i].setMinimumSize(new Dimension(20, 20));
        }
        buttonsTopMenu[24].addActionListener(new ChangeEventAction());

        int gridX = 0;
        int count = 1;
        for (JButton jButton : buttonsTopMenu) {

            constraints.gridx = gridX;
            constraints.gridwidth = 1;
            constraints.gridy = 0;
            if (count <= 4) {
                constraints.insets.left = 5;
                constraints.insets.right = 5;
                count++;
            } else {
                constraints.insets.right = 15;
                count = 1;
            }

            gridX = gridX + 1;
            menuTopJP0.add(jButton, constraints);
        }
        constraints.weightx = 0.7;
        menuTopJP0.add(jPanelEmpty, constraints);
    }
    public void createDataPanel(){
        dataPanel.createDataVar0(dataCentreJP0);
    }

    class ChangeEventAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (control == 0) {
                dataPanel.createDataVar0(dataCentreJP0);
                control = 1;

            } else {
                dataPanel.createDataVar1(dataCentreJP0);
                control = 0;
                System.out.println(control);
            }
            mainPanel.updateUI();
        }
    }
}






