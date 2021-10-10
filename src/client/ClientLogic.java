package client;

import client.modes.Mode;
import logic.Message;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ClientLogic {

    Robot robot;
    Rectangle screen;
    ArrayList<Mode> modes;

    public ClientLogic(){
        try {
            this.robot = new Robot();
            this.screen = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            this.modes = new ArrayList<>();
        } catch (AWTException e) {
            e.printStackTrace(); //toDo: Exception-Handling
        }
    }

    public BufferedImage getScreenImage(){
        return robot.createScreenCapture(screen);
    }

    public void proceedMessage(Message m){

    }

    public void addMode(Mode m){
        modes.add(m);
        m.run();
    }

    private static class MyMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(e);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println(e);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println(e);
        }
    }

}


