/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author FA20-BSE-042
 */
interface  car {
public  void  tyres();
public  void  seats();
}

interface bike {
String gear="6 gears";
}

class transport implements bike,car{
public void tyres(){
System.out.println("car has 4 tyrres");
}
public void seats(){
System.out.println("car has 5 seats");
}
}
 class testtransport{
 public static void main(String[] args){
 transport t=new transport();
  t.tyres();
  System.out.println("bike has:" + bike.gear);
 
 
 
 
 }
 
 }



