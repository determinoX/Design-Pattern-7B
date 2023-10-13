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
public class StudentRepository implements Container {
   public String names[] = {"Robert" , "John" ,"Julie" , "khan"};
    public String RegNo[] = {"fa20" , "fa21" ,"fa23" , "fa22"};
    public String PhoneNo[] = {"1111" , "2222" ,"4444" , "3333"};
    public String Gender[] = {"male" , "male" ,"female" , "male"};
    
    

   @Override
   public Iterator getIterator() {
      return new StudentIterator();
   }

   private class StudentIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }		
   }
}
