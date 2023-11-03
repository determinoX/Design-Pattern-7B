/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author FA20-BSE-042
 */
class  plane  {
private String name;
private  double averageweight;
private  int numberofwings;

// Getter methods
public String getname()  {
return name;
}
public  double  getaverageweight()  {
return averageweight;
}
public  int  getnumberofwings()  {
return numberofwings;
}
// Setter methods
public  void  setname(String name)  {
this.name  = name;
}
public  void  setaverageweight(double averageweight)  {
this.averageweight  = averageweight;
}
public  void  setnumberofwings(int numberofwings)  {
this.numberofwings  = numberofwings;
}
}
class  Testplane  {
public  static  void  main(String[] args)  {
plane myplane =  new plane();
myplane.setname("Airbus");
myplane.setaverageweight(1500);
myplane.setnumberofwings(2);
System.out.println("Name: "  + myplane.getname());
System.out.println("Average weight: "  + myplane.getaverageweight()  +  "tonnes");
System.out.println("Number of wings: "  + myplane.getnumberofwings());
}
}