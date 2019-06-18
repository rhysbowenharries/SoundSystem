import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Radio1");
    }

    @Test
    public void canGetStation(){
        assertEquals("Radio1", radio.getStation());
    }

    @Test
    public void canSetStation(){
        radio.tune("RadioX");
        assertEquals("RadioX", radio.getStation());
    }

    @Test
    public void canPlay(){
        assertEquals("la la la, playing hits from Radio1", radio.play());
    }

}
