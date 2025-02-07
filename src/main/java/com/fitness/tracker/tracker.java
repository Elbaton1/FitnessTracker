package com.fitness.tracker;

import java.util.ArrayList;
import java.util.List;

/*
 * manages multiple workouts and goals
 */
public class tracker {
    private List<workout> workouts;
    private List<goal> goals;

    public tracker() {
        this.workouts = new ArrayList<>();
        this.goals = new ArrayList<>();
    }

    public void add_workout(workout w) {
        workouts.add(w);
    }

    public List<workout> get_workouts() {
        return new ArrayList<>(workouts);
    }

    public int total_calories() {
        int sum = 0;
        for (workout w : workouts) {
            sum += w.getCalos();    // Updated reference to getCalos()
        }
        return sum;
    }

    public void add_goal(goal g) {
        goals.add(g);
    }

    public List<goal> get_goals() {
        return new ArrayList<>(goals);
    }

    public void update_goal(goal g, int cals) {
        if (!goals.contains(g)) {
            throw new IllegalArgumentException("goal not found");
        }
        g.addProg(cals);          // Updated reference to addProg(...)
    }

    public boolean check_goal(goal g) {
        if (!goals.contains(g)) {
            throw new IllegalArgumentException("goal not found");
        }
        return g.isAchieved();    // Updated reference to isAchieved()
    }
}
