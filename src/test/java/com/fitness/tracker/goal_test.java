package com.fitness.tracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class goal_test {

    @Test
    public void test_goal_creation_and_progress() {
        goal g = new goal("burn 500 cals", 500);

        assertEquals("burn 500 cals", g.getdescription());
        assertEquals(500, g.gettarget());
        assertEquals(0, g.getprogress());
        assertFalse(g.is_achieved());

        g.add_progress(300);
        assertEquals(300, g.getprogress(), "should have 300 cals now");
        assertFalse(g.is_achieved(), "Haven't reached 500 yet");

        g.add_progress(200);
        assertEquals(500, g.getprogress(), "should be at 500 now");
        assertTrue(g.is_achieved(), "reached the 500 target! nice");
    }

    @Test
    public void test_goal_negative_progress() {
        goal g = new goal("burn 300 cals", 300);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            g.add_progress(-50);
        });
        assertEquals("calories cannot be negative", ex.getMessage(),
            "Should fail if i add negative cals");
    }
}
