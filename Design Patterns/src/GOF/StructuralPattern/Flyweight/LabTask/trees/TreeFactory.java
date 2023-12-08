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
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
            treeTypes.put(name, result);
        }
        return result;
    }
    
    
//    static Map<String, TreeType> treeTypes = new HashMap<>();
//
//    public static TreeType getTreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
//        TreeType result = treeTypes.get(name);
//        if (result == null) {
//            result = new TreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
//            treeTypes.put(name, result);
//        }
//        return result;
//    }
}