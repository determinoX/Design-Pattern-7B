/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Flyweight.RefactoringGuruExample.forest;

/**
 *
 * @author FA20-BSE-042
 */
import GOF.StructuralPattern.Flyweight.RefactoringGuruExample.trees.Tree;
import GOF.StructuralPattern.Flyweight.RefactoringGuruExample.trees.TreeFactory;
import GOF.StructuralPattern.Flyweight.RefactoringGuruExample.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
