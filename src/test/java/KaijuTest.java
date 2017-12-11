import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Barney testBarney;
    Wallace testWallace;


    @Before
    public void before(){
        testBarney = new Barney("Barney", 10, 5);
        testWallace = new Wallace("Wallace", 20, 10);
    }

    @Test
    public void bothCanRoar(){
        Assert.assertEquals(testBarney.roar(), "ROAR!");
        Assert.assertEquals(testWallace.roar(), "ROAR!");
    }

}
