package com.gunax.samplegame;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        super("A Very Exciting Game");
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new GameApplet());

        //pack sizes the frame to fit the content
        pack();
        setVisible(true);
    }
}
