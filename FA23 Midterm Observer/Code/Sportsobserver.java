import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;

public interface Sportsobserver {
    void subscribe(SportsSubsricption  subscriber);
    void unsubscribe(SportsSubsricption  subscriber);
    void notifysubscriber(SportsSubsricption  subscriber);
}
//sportssubscription.java
class SportsSubsricption implements Sportsobserver {
private List<Subscriber> subscribers = new ArrayList<>();

 public void sendSportsUpdate(String sport, String message){
  notifySubscriber(sport,message);
}

@Override
public void subscribe(Subscriber subscriber){
  subscribers.add(subscriber);
}

@Override
public void unsubscribe(Subscriber subscriber){
  subscribers.remove(subscriber);
}
@Override
public void notifysubscribe(Subscriber subscriber){
  subscribers.notify(subscriber);
}

}