//
//
//package com.tutorial.main;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Graphics;
//
//import javax.swing.JTextArea;
//
//    public class HUD {
//
//
//        public static int HEALTH = 100;
//        public static int FULLHEALTH = 100;
//        private int greenValue = 255;
//
//        public void tick() {
//
//            HEALTH = Game.clamp(HEALTH, 0, 100);
//            greenValue = Game.clamp(greenValue, 0, 255);
//
//            greenValue = HEALTH*2;
//
//
//            if (HEALTH == 0)
//                System.exit(1);
//
//        }
//
//        public void render(Graphics g) {
//            g.setColor(Color.gray);
//            g.fillRect(15, 15, 200, 32);
//            g.setColor(new Color(75, greenValue, 0));
//            g.fillRect(15, 15, HEALTH * 2, 32);
//            g.setColor(Color.white);
//            g.drawRect(15, 15, 200, 32);
//
//
//            String string = "/";
//            Font stringFont = new Font( "HEALTH", Font.PLAIN, 18 );
//            g.setFont( stringFont );
//            g.drawString(String.valueOf(HEALTH), 15, 15);
//            g.drawString(String.valueOf(FULLHEALTH), 50, 15);
//            if(HEALTH < 100){
//                delete g.drawString(String.valueOf(FULLHEALTH), 50, 15);// how to make this command work?
//
//
//                g.drawString(String.valueOf(FULLHEALTH), 45, 15);
//                g.drawString("/", 40, 15);
//
//
//            }
//        }
//    }
//}
