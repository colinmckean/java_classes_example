import java.util.ArrayList;

public class Bus{
  private ArrayList<Person> passengers;

  public Bus(){
   this.passengers = new ArrayList<Person>();
 }

 public int numberOfPassengers(){
  return passengers.size();
 }
}