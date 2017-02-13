import java.util.ArrayList;

public class Bus{
  private ArrayList<Person> passengers;
  private int busCapacity;

  public Bus(){
   this.passengers = new ArrayList<Person>();
   this.busCapacity = 5;
 }

 public int numberOfPassengers(){
  return passengers.size();
 }
 public void add(Person passenger){
  passengers.add(passenger);
 }
 public boolean isFull(){
  return numberOfPassengers() == this.busCapacity;
 }
}