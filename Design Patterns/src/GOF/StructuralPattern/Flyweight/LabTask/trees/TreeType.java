/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Flyweight.LabTask.trees;

/**
 *
 * @author FA20-BSE-042
 */
import GOF.StructuralPattern.Flyweight.LabTask.forest.Forest;
import java.awt.*;

public class TreeType {
    
    
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    public void draw(Graphics g, int x, int y) {
        int treeSize = calculateTreeSize(y);

        g.setColor(Color.BLACK);
        g.fillRect(x - treeSize / 2, y, treeSize, treeSize);
        g.setColor(color);
        g.fillOval(x - treeSize / 2, y - treeSize, treeSize, treeSize);

        if (isFruitTree) {
            drawFruits(g, x, y, treeSize);
        }
    }

    private void drawFruits(Graphics g, int x, int y, int treeSize) {
        g.setColor(Color.RED);
        int triangleSize = treeSize / 2;

        for (int i = 0; i < countOfFruits; i++) {
            int startX = x + i * (treeSize / countOfFruits);
            int startY = y - treeSize - triangleSize;
            g.fillOval(startX - triangleSize / 2, startY, triangleSize, triangleSize);
        }
    }

    private int calculateTreeSize(int y) {
        double normalizedY = (double) y / Forest.CANVAS_SIZE;
        if (normalizedY > 2.0 / 3) {
            return 40; // Large in the south
        } else if (normalizedY > 1.0 / 3) {
            return 30; // Medium in the middle
        } else {
            return 20; // Small in the north
        }
    }
    
    
    
    
    
//    private String name;
//    private Color color;
//    private String otherTreeData;
//    private boolean isFruitTree;
//    private int countOfFruits;
//
//    public TreeType(String name, Color color, String otherTreeData,boolean isFruitTree, int countOfFruits) {
//        this.name = name;
//        this.color = color;
//        this.otherTreeData = otherTreeData;
//        this.isFruitTree = isFruitTree;
//        this.countOfFruits = countOfFruits;
//    }
//
//    public void draw(Graphics g, int x, int y) {
//        int treeSize = calculateTreeSize(y);
//        
//        g.setColor(Color.BLACK);
//        g.fillRect(x - treeSize / 2, y, treeSize, treeSize);
//        g.setColor(color);
//        g.fillOval(x - treeSize / 2, y - treeSize, treeSize, treeSize);
//        
////        g.setColor(Color.BLACK);
////        g.fillRect(x - 1, y, 3, 5);
////        Color treeColor = isFruitTree ? color.darker() : color;
////        g.setColor(treeColor);
////        g.fillOval(x - 5, y - 10, 10, 10);
// //       g.setColor(color);
////        g.fillOval(x - 5, y - 10, 10, 10);
//        if (isFruitTree) {
//            drawFruits(g, x, y, treeSize);
//        }
//    }
//    
//    
//    private void drawFruits(Graphics g, int x, int y, int treeSize) {
//        // Add logic to draw triangles representing fruits
//        g.setColor(Color.RED);
//        int triangleSize = treeSize / 2; // Adjust the size of the triangle
//        int triangleHeight = (int) (Math.sqrt(3) * triangleSize / 2);
//
//        for (int i = 0; i < countOfFruits; i++) {
//            int startX = x + i * (treeSize / countOfFruits);
//            int[] xPoints = {startX, startX - triangleSize / 2, startX + triangleSize / 2};
//            int[] yPoints = {y - treeSize, y - treeSize - triangleHeight, y - treeSize - triangleHeight};
//            g.fillPolygon(xPoints, yPoints, 3);
//        }
//    }
////    private void drawFruits(Graphics g, int x, int y, int treeSize) {
////        // Add logic to draw triangles representing fruits
////        g.setColor(Color.RED);
////        int triangleSize = 8; 
////        int triangleHeight = (int) (Math.sqrt(3) * triangleSize / 2);
////
////        for (int i = 0; i < countOfFruits; i++) {
////            int startX = x + i * 10;
////            int[] xPoints = {startX, startX - triangleSize / 2, startX + triangleSize / 2};
////            int[] yPoints = {y - 15, y - 15 - triangleHeight, y - 15 - triangleHeight};
////            g.fillPolygon(xPoints, yPoints, 3);
////        }
////    }
//    
//    private int calculateTreeSize(int y) {
//        // Adjust the size based on the y coordinate
//        double normalizedY = (double) y / Forest.CANVAS_SIZE;
//        if (normalizedY > 2.0 / 3) {
//            return 100; // Large in the south
//        } else if (normalizedY > 1.0 / 3) {
//            return 50; // Medium in the middle
//        } else {
//            return 10; // Small in the north
//        }
//    }
}