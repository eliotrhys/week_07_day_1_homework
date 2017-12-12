import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Barney testBarney;
    Wallace testWallace;
    Tank testTank;
    MissileTruck testMissileTruck;

    @Before
    public void before(){
        testTank = new Tank("KILLER TANK", 10);
        testMissileTruck = new MissileTruck("MISSILE TRUCK", 20);
        testBarney = new Barney("Barney", 10, 5);
        testWallace = new Wallace("Wallace", 20, 10);
    }



}
