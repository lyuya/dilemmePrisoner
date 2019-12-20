package observer;

public interface Observable { // je préfère dire Observable plutot que Subject
public void subscribe(Observer o);
public void unsubscribe(Observer o);
public void notifyObservers();
}