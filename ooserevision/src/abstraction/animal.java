/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author FA20-BSE-042
 */
abstract class animal {
abstract void run();
abstract void stop();
}


class cheetah extends animal{  
void run(){
    System.out.println("cheetah is running");
} 

    @Override
    void stop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 }

class testanimal{
public static void main(String arg[]){
animal c=new cheetah();
c.run();


}



}