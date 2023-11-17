/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Facade.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape triangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        triangle = new Triangle();
    }

    public void draw(String shapes) {
        StringBuilder builder = new StringBuilder();
        for (String shape : shapes.split(",")) {
            switch (shape) {
                case "circle":
                    circle.draw();
                    builder.append("Circle ");
                    break;
                case "rectangle":
                    rectangle.draw();
                    builder.append("Rectangle ");
                    break;
                case "square":
                    square.draw();
                    builder.append("Square ");
                    break;
                case "triangle":
                    triangle.draw();
                    builder.append("Triangle ");
                    break;
                default:
                    System.out.println("Unknown shape: " + shape);
            }
        }
        System.out.println("Drawn shapes: " + builder.toString());
    }
}
