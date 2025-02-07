package com.fitness.tracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class workout_test {

    @Test
    public void test_workout_creation_valid() {
        LocalDate date = LocalDate.now();
        workout w = new workout(date, "running", 30, 300);

        assertEquals(date, w.getdate(), "Should be today's date, not some random day!");
        assertEquals("running", w.gettype(), "We want a 'running' type, not 'zzz'!");
        assertEquals(30, w.getduration(), "We want 30 minutes, not 0!");
        assertEquals(300, w.getcalories(), "We want 300 cals burned, not 0!");
    }

    @Test
    public void test_workout_invalid_duration() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new workout(LocalDate.now(), "cycling", 0, 100);
        });
        assertEquals("duration must be positive", ex.getMessage(),
            "We want an error if duration <= 0!");
    }

    @Test
    public void test_workout_invalid_calories() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new workout(LocalDate.now(), "swimming", 40, -10);
        });
        assertEquals("calories cannot be negative", ex.getMessage(),
            "We want an error if cals are negative!");
    }
}
