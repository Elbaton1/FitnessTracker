package com.fitness.tracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class goal_test {

    @Test
    public void test_goal_creation_and_prog() {
        goal g = new goal("burn 500 cals", 500);

        assertEquals("burn 500 cals", g.getdescription());
        assertEquals(500, g.getTarg());
        assertEquals(0, g.getProg());
        assertFalse(g.isAchieved());

        g.addProg(300);
        assertEquals(300, g.getProg(), "should have 300 cals now");
        assertFalse(g.isAchieved(), "Haven't reached 500 yet");

        g.addProg(200);
        assertEquals(500, g.getProg(), "should be at 500 now");
        assertTrue(g.isAchieved(), "reached the 500 targ! nice");
    }

    @Test
    public void test_goal_negative_prog() {
        goal g = new goal("burn 300 cals", 300);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            g.addProg(-50);
        });

        assertEquals("calories cant be negative", ex.getMessage(),
                "Should fail if I add negative cals");
    }
}
