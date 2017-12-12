import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Barney testBarney;
    Wallace testWallace;
    Tank testTank;
    MissileTruck testMissileTruck;


    @Before
    public void before(){
        testBarney = new Barney("Barney", 10, 5);
        testWallace = new Wallace("Wallace", 20, 10);
        testTank = new Tank("KILLER TANK", 10);
        testMissileTruck = new MissileTruck("MISSILE TRUCK", 20);
    }

    @Test
    public void bothCanRoar(){
        assertEquals(testBarney.roar(), "ROAR!");
        assertEquals(testWallace.roar(), "ROAR!");
    }

    @Test
    public void bothCanFly(){
        assertEquals("FLYEEEEE!", testWallace.fly());
        assertEquals("I CAN FLY!", testBarney.fly());
    }

    @Test
    public void kaijuCanAttackTruck(){
        assertEquals(testBarney.attackVehicle(testTank), 5);
    }

}
