public interface SportsSubsricption implements Sportsobserver {
   //method will help to subscribe
   void subscribe(){
   System.out.println("subscribe to hockey"); 
   System.out.println("subscribe to football");
   System.out.println("subscribe to cricket");
   System.out.println("subscribe to volleyball");
   
   }
   //method will help to unsubscribe
   void unsubscribe(){
   System.out.println("unsubscribe to hockey"); 
   System.out.println("unsubscribe to football");
   System.out.println("unsubscribe to cricket");
   System.out.println("unsubscribe to volleyball");
   }
   //will notify the subscribers about updates
   void notifysubscriber(){}

}
