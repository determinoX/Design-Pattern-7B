
abstract class Shape{  
abstract void draw();  
}  

class Rectangle extends Shape{  
void draw(){
    System.out.println("drawing rectangle");
}  
}  
class Circle extends Shape{  
void draw(){
    System.out.println("drawing circle");
}  
}  
  
class TestShape{  
public static void main(String args[]){  
Shape c=new Circle();
Shape r=new Rectangle();
c.draw(); 
r.draw();
}  
}  
