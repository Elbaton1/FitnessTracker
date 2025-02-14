package com.fitness.tracker;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class workout_test {

    @Test
    public void test_workout_creation_valid() {
        LocalDate date = LocalDate.now();
        workout w = new workout(date, "running", 30, 300);

        assertEquals(date, w.getdate(), "should be todays date");
        assertEquals("running", w.gettype(), "a running type");
        assertEquals(30, w.getDur(), "30 minutes");
        assertEquals(300, w.getCalos(), "300 cals burned");
    }

    @Test
    public void test_workout_invalid_dur() {
        
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new workout(LocalDate.now(), "cycling", 0, 100);
        });
        assertEquals("duration gotta be positive", ex.getMessage(),
            "Error if duration <= 0!");
    }

    @Test
    public void test_workout_invalid_calos() {
        
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new workout(LocalDate.now(), "swimming", 40, -10);
        });
        
        assertEquals("calories cant be negative", ex.getMessage(),
            "Error if calos are negative");
    }
}
