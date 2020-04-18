package com.gunax.samplegame;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

/**
 * A <i>very</i> exciting game
 */
@SuppressWarnings( "deprecation" ) //Applet is deprecated... but that's why were are exploiting it
public class GameApplet extends Applet implements MouseListener {

    private final int WINDOW_WIDTH = 400, WINDOW_HEIGHT = 420, SCORE_HEIGHT = 20;
    private final int TARGET_WIDTH = 50, TARGET_HEIGHT = 50;
    private int posX = 0, posY = 0;
    private int score = 0;
    Random random = new Random();

    public GameApplet() {
        addMouseListener(this);
        moveTarget();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawTarget(g);
        drawScore(g);
    }

    private void drawTarget(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(posX, posY, 50,50);
    }

    private void drawScore(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,WINDOW_HEIGHT - SCORE_HEIGHT, WINDOW_WIDTH,SCORE_HEIGHT);

        g.setColor(Color.white);
        g.drawString("Score: " + score, 5, WINDOW_HEIGHT - SCORE_HEIGHT + 12);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("There was a click");
        if(new Rectangle(posX,posY,TARGET_WIDTH,TARGET_HEIGHT).contains(e.getPoint())) {
            moveTarget();
            score += 1;
            this.repaint();
        }
    }

    private void moveTarget() {
        posX = random.nextInt(350);
        posY = random.nextInt(350);
    }

    //do nothing
    @Override
    public void mousePressed(MouseEvent e) {

    }

    //do nothing
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    //do nothing
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    //do nothing
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
