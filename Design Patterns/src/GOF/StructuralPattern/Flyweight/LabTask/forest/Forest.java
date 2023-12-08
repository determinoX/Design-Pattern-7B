/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Flyweight.LabTask.forest;

/**
 *
 * @author FA20-BSE-042
 */
import GOF.StructuralPattern.Flyweight.LabTask.trees.Tree;
import GOF.StructuralPattern.Flyweight.LabTask.trees.TreeFactory;
import GOF.StructuralPattern.Flyweight.LabTask.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame{
    
    public static int CANVAS_SIZE = 500;

    private List<Tree> trees = new ArrayList<>();

    public int getCanvasSize() {
        return CANVAS_SIZE;
    }

    public void plantTree(int x, int y, String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }

//    static int CANVAS_SIZE;
//    private List<Tree> trees = new ArrayList<>();
//
//    public void plantTree(int x, int y, String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
//        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
//        Tree tree = new Tree(x, y, type);
//        trees.add(tree);
//    }
//    public int getCanvasSize() {
//        return CANVAS_SIZE;
//    }
//
//
//    @Override
//    public void paint(Graphics graphics) {
//        for (Tree tree : trees) {
//            tree.draw(graphics);
//        }
//    }
}