/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.CreationalPattern.Singleton.SingeltonFA20;

/**
 *
 * @author shafq
 */

public class Connection {
	private static Connection instance;
	private Connection(){
		
	}
	public static Connection getInstance(){
		if(instance == null){
			instance = new Connection();
		}
		return instance;
	}
	public void getData(){
		System.out.println("This is the data retrieved from the DB");
	}

}
