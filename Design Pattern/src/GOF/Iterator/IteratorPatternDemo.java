/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Iterator;

/**
 *
 * @author FA20-BSE-042
 */
public class IteratorPatternDemo {
	
   public static void main(String[] args) {
      StudentRepository StudentRepository = new StudentRepository();

      for(Iterator iter = StudentRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
         System.out.println("RegNo : " + RegNo);
          System.out.println("PhoneNo : " + PhoneNo);
           System.out.println("Gender : " + Gender);
      } 	
   }
}
