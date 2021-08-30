package za.ac.cput.LogiTruck;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static org.junit.Jupiter.api.Assertions.*;

class Truck_DriverTest {

private Truck_DriverTest driver1;
private Truck_DriverTest driver2;
private Truck_DriverTest driver3;

@Before
void setUp()
{
    driver1 = new Truck_DriverTest();
    driver2 = new Truck_DriverTest();
    driver3 = driver1;

}

//Object Equality
 @Test

 public void testObjectEquality() //shallow Comparison (==)
 {
     assertSame(driver1, driver3);

 }

    @Test

    public void testObjectEquality2()
    {
        assertSame(driver1, driver2);

    }

    //Object Identity
  @Test

  public void testObjectIdentity() //Deep comparison(.equals)
  {
      assertEquals(driver1,driver3);
  }
}