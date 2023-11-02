//sportssubscription.java

import java.util.concurrent.Flow.Subscriber;

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
public void notifySubscribers(String sport, String message){
  for(Subscriber subscribe : subscribers){
   subscriber.update(sport,message);

  }
}

}