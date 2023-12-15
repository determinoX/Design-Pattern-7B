/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.BehavioralPattern.Memento.refactoringguru;

/**
 *
 * @author FA20-BSE-042
 */
import GOF.BehavioralPattern.Memento.refactoringguru.editor.Editor;
import GOF.BehavioralPattern.Memento.refactoringguru.shapes.Circle;
import GOF.BehavioralPattern.Memento.refactoringguru.shapes.CompoundShape;
import GOF.BehavioralPattern.Memento.refactoringguru.shapes.Dot;
import GOF.BehavioralPattern.Memento.refactoringguru.shapes.Rectangle;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
