/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Flyweight.LabTask;

/**
 *
 * @author FA20-BSE-042
 */

import GOF.StructuralPattern.Flyweight.LabTask.forest.Forest;

import java.awt.*;

public class Demo {
    static int TREES_TO_DRAW = 100;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < TREES_TO_DRAW; i++) {
            forest.plantTree(random(0, Forest.CANVAS_SIZE), random(0, Forest.CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub", false, 0);
            forest.plantTree(random(0, Forest.CANVAS_SIZE), random(0, Forest.CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub", true, 5);
        }
        forest.setSize(Forest.CANVAS_SIZE, Forest.CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
//    static int CANVAS_SIZE = 700;
//    static int TREES_TO_DRAW = 100;
//    static int TREE_TYPES = 2;
//
//    public static void main(String[] args) {
//        Forest forest = new Forest();
//        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
////            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
////                    "Summer Oak", Color.GREEN, "Oak texture stub");
////            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
////                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
//            forest.plantTree(random(0, Forest.CANVAS_SIZE), random(0, Forest.CANVAS_SIZE),
//        "Summer Oak", Color.GREEN, "Oak texture stub", false, 0);
//            forest.plantTree(random(0, Forest.CANVAS_SIZE), random(0, Forest.CANVAS_SIZE),
//        "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub", true, 5);
//        }
//        forest.setSize(Forest.CANVAS_SIZE, Forest.CANVAS_SIZE);
//        forest.setVisible(true);
////        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
////        forest.setVisible(true);
//
//        System.out.println(TREES_TO_DRAW + " trees drawn");
//        System.out.println("---------------------");
//        System.out.println("Memory usage:");
//        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
//        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
//        System.out.println("---------------------");
//        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
//                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
//    }
//
//    private static int random(int min, int max) {
//        return min + (int) (Math.random() * ((max - min) + 1));
//    }
}