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
public class TriangleGeometry extends Geometery {
    
	public Shape createShape() {
		return new Triangle();
	}
    
}
