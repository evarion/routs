package com.evarion.main;


import com.evarion.gui.MainGui;
import com.evarion.gui.MainGui2;

import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGui frame = new MainGui();
                frame.setVisible(true);
                MainGui2 frame2 = new MainGui2();
                frame2.setVisible(true);
            }
        });
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        System.out.println("ширина = " + width + " высота = " + height);

        //120/1920*100=6.25
        //1800/1920*100=93.75

        //1920*6.25/100=120
        //int widthPanelPercent
        //int widthPanel = width*widthPanel/100=120;


        double dx = 6.25; //double dx = 6.25;
        double dx1 = 93.75; //double dx1 = 93.75;
        double newDouble1 = new BigDecimal(dx).setScale(3, RoundingMode.HALF_UP).doubleValue();
        int ix = (int) newDouble1; // переводим в int

        double newDouble2 = new BigDecimal(dx1).setScale(3, RoundingMode.HALF_UP).doubleValue();
        int ix1 = (int) newDouble2; // переводим в int


        System.out.println(ix + " из 6.25");
        System.out.println(ix1 + " из 93.75");


        int result = (int) Math.round(dx);
        int result1 = (int) Math.round(dx1);
        if (result + result1 > 100) {
            result1 = result1 - 1;
        }

        System.out.println(result);
        System.out.println(result1);
    }
}
