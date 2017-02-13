import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusTest{
  Bus bus;
  BusStop busStop;
  Person person_1;
  Person person_2;
  Person person_3;
  Person person_4;
  Person person_5;

  @Before
  public void before(){
    bus = new Bus();
    busStop = new BusStop();
    person_1 = new Person();
    person_2 = new Person();
    person_3 = new Person();
    person_4 = new Person();
    person_5 = new Person();
  }

  @Test
  public void countPassengers(){
    assertEquals(0, bus.numberOfPassengers());
  }

  @Test 
  public void canAddPassengers(){
    bus.add(person_1);
    assertEquals(1, bus.numberOfPassengers());
  }

  @Test
  public void testBusIsNotFull(){
    assertEquals(false,bus.isFull());
  }  
  @Test
  public void testBusIsFull(){
    bus.add(person_1);
    bus.add(person_2);
    bus.add(person_3);
    bus.add(person_4);
    bus.add(person_5);
    assertEquals(true,bus.isFull());
  }

  @Test
  public void testBusStopIsEmpty(){
    assertEquals(0, busStop.numberOfPassengersAtBusStop());
  }

}