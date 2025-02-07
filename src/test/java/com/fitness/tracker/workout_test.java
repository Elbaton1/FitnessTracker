package com.fitness.tracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class workout_test {

    @Test
    public void test_workout_creation_valid() {
        LocalDate date = LocalDate.now();
        workout w = new workout(date, "running", 30, 300);

        assertEquals(date, w.getdate(), "Should be todays date");
        assertEquals("running", w.gettype(), "a running type");
        assertEquals(30, w.getduration(), "30 minutes");
        assertEquals(300, w.getcalories(), "300 cals burned");
    }

    @Test
    public void test_workout_invalid_duration() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new workout(LocalDate.now(), "cycling", 0, 100);
        });
        assertEquals("duration must be positive", ex.getMessage(),
            "error if duration <= 0!");
    }

    @Test
    public void test_workout_invalid_calories() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new workout(LocalDate.now(), "swimming", 40, -10);
        });
        assertEquals("calories cannot be negative", ex.getMessage(),
            "error if cals are negative!");
    }
}
