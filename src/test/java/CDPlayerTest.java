import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "X-12");
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("X-12", cdPlayer.getModel());
    }

    @Test
    public void canInsertCD(){
        cdPlayer.insertCD("Darkside Of the Moon");
        assertEquals(1, cdPlayer.disksInPlayer());
    }

    @Test
    public void canSelectCD(){
        cdPlayer.insertCD("Darkside Of the Moon");
        assertEquals("Darkside Of the Moon", cdPlayer.selectCD(1));
    }
}
