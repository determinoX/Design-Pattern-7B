/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.CreationalPattern.FactoryMethod.FactoryMethodFA20;

/**
 *
 * @author FA20-BSE-042
 */
public class SquareGeometry extends Geometery{

	public Shape createShape() {
		return new Square();
	}

}