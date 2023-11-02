public class SportsSubsricptiondemo {
    public static void main(String[] args) {
        SportsSubsricption subscricption = new  SportsSubsricption();
        User user1 =new User ("");
        User user2 =new User ("");

        subscricption.subscribe(user1);
        subscricption.subscribe(user2);

        subscricption.sendSportsUpdate("cricket", "match rescheduled");
        subscricption.sendSportsUpdate("football", "match rescheduled");
        subscricption.sendSportsUpdate("cricket", "match lost by pakistan");
        
        
    }
}
