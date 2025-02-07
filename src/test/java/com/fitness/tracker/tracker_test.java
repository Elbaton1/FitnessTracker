package com.fitness.tracker;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class tracker_test {

    private tracker fit_tracker;

    @BeforeEach
    public void setup() {
        fit_tracker = new tracker();
    }

    @Test
    public void test_add_workout_and_total_calories() {
        workout w1 = new workout(LocalDate.now(), "running", 30, 300);
        workout w2 = new workout(LocalDate.now(), "cycling", 45, 450);

        fit_tracker.add_workout(w1);
        fit_tracker.add_workout(w2);

        assertEquals(2, fit_tracker.get_workouts().size(), 
            "i added 2 workouts, so expect 2 in the list");
        assertEquals(750, fit_tracker.total_calories(), 
            "300+450 should be 750 cals");
    }

    @Test
    public void test_add_goal_and_check() {
        goal g = new goal("burn 700 cals", 700);
        fit_tracker.add_goal(g);

        workout w1 = new workout(LocalDate.now(), "running", 30, 300);
        workout w2 = new workout(LocalDate.now(), "cycling", 45, 450);
        fit_tracker.add_workout(w1);
        fit_tracker.add_workout(w2);

        fit_tracker.update_goal(g, fit_tracker.total_calories());
        assertTrue(fit_tracker.check_goal(g),
            "you burned 750, passed the 700 goal");
    }

    @Test
    public void test_update_goal_not_found() {
        goal g = new goal("burn 600 cals", 600);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            fit_tracker.update_goal(g, 100);
        });
        assertEquals("goal not found", ex.getMessage(),
            "Should fail if i update a goal that's not in the list");
    }
}
