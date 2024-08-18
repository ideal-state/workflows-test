package team.idealstate.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void messageEqualsDefaultValue() {
        assertEquals(Main.getMessage(), Main.DEFAULT_MESSAGE);
    }

    @Test
    public void messageNotEqualsDefaultValue() {
        assertNotEquals(Main.getMessage(), Main.DEFAULT_MESSAGE);
    }
}
