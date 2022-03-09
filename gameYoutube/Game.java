package gameYoutube;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;

public class Game {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay play = new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(play);
    }
}
