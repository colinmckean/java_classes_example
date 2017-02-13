import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusTest{
  Bus bus;
  Person person_1;

  @Before
  public void before(){
    bus = new Bus();
    person_1 = new Person();
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
}