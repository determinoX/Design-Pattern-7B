/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.CreationalPattern.Singleton.SingeltonFA20;

/**
 *
 * @author shafq
 */

public class Demo {

	public static void main(String[] args) {
		Connection c = Connection.getInstance();
		c.getData();

	}

}
