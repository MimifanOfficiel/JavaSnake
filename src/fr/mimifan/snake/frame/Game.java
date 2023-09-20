package fr.mimifan.snake.frame;

import fr.mimifan.snake.utils.GameVars;

import javax.swing.*;

public class Game {

    private static Game instance = new Game();
    private static JFrame frame = new JFrame("Snake");

    public void load(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();

        frame.setContentPane(new GridPanel(GameVars.NumberOfCellsWIDTH, GameVars.NumberOfCellsHEIGHT));

        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public static Game getInstance() {
        return instance;
    }
}
