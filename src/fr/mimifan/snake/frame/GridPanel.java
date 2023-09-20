package fr.mimifan.snake.frame;

import fr.mimifan.snake.utils.GameVars;

import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {

    private int rows;
    private int cols;

    public GridPanel(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int cellWidth = getWidth() / cols;
        int cellHeight = getHeight() / rows;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int x = col * cellWidth;
                int y = row * cellHeight;
                g.drawRect(x, y, cellWidth, cellHeight);
            }
        }
    }

}
