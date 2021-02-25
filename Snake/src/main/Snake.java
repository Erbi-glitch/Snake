package main;

import javax.swing.*;

public class Snake extends JFrame {

    public Snake(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400,400,352,352);
        setLocation(320,320);
        add(new pole());
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        Snake mw = new Snake();
    }
}