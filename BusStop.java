import java.util.ArrayList;

public class BusStop{
  private ArrayList<Person> busStop;

  public BusStop(){
    this.busStop = new ArrayList<Person>();
  }

  public int numberOfPassengersAtBusStop(){
    return busStop.size();
  }
}