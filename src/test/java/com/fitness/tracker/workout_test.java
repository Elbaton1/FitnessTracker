package com.fitness.tracker;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/*
 * workout_test class:
 *  - Checks valid creation
 *  - Ensures we fail if duration <= 0
 *  - Ensures we fail if calos < 0
 */
public class workout_test {

    @Test
    public void test_workout_creation_valid() {
        LocalDate date = LocalDate.now();
        workout w = new workout(date, "running", 30, 300);

        assertEquals(date, w.getdate(), "Should be today's date");
        assertEquals("running", w.gettype(), "A running type");
        assertEquals(30, w.getDur(), "30 minutes");
        assertEquals(300, w.getCalos(), "300 cals burned");
    }

    @Test
    public void test_workout_invalid_dur() {
        // Expect an exception if duration <= 0
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new workout(LocalDate.now(), "cycling", 0, 100);
        });
        assertEquals("duration gotta be positive", ex.getMessage(),
            "Error if duration <= 0!");
    }

    @Test
    public void test_workout_invalid_calos() {
        // Expect an exception if calos < 0
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new workout(LocalDate.now(), "swimming", 40, -10);
        });
        // Must match what's actually thrown in workout.java
        assertEquals("calories cant be negative", ex.getMessage(),
            "Error if calos are negative!");
    }
}
