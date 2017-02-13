import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusTest{
  Bus bus;

  @Before
  public void before(){
    bus = new Bus();
  }

  @Test
  public void countPassengers(){
    assertEquals(0, bus.numberOfPassengers());
  }
}