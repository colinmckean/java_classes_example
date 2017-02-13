import java.util.ArrayList;

public class BusStop{
  private ArrayList<Person> busStop;

  public BusStop(){
    this.busStop = new ArrayList<Person>();
  }

  public int numberOfPassengersAtBusStop(){
    return busStop.size();
  }
  public void addtoQueue(Person passenger){
    busStop.add(passenger);
  }
  public void removeFromQueue(Person passenger){
    busStop.remove(passenger);
  }

  public void getOnBus(Person passenger, Bus bus){
    removeFromQueue(passenger);
    bus.add(passenger);
  }

}