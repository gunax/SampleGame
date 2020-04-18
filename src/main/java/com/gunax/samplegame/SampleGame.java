package com.gunax.samplegame;

public class SampleGame {

    public static void main(String[] args) {

        //Use Event-Dispatch-Thread so UI runs on its own thread
        javax.swing.SwingUtilities.invokeLater(() -> new GameFrame());
    }
}
