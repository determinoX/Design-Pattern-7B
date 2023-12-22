/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.CreationalPattern.FactoryMethod.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		CricleGeometry cricleGeomerty = new CricleGeometry();
		SquareGeometry squareGeometry = new SquareGeometry();
                TriangleGeometry triangleGeometry = new TriangleGeometry();
		
		shapes.add(cricleGeomerty.createShape());
		shapes.add(squareGeometry.createShape());
                shapes.add(triangleGeometry.createShape());
		
		for(Shape s:shapes){
			s.draw();
		}

	}

}