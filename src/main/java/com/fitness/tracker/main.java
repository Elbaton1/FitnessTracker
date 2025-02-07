package com.fitness.tracker;
import java.time.LocalDate;
public class main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("        D O P E         A S S        ");
        System.out.println("     F I T N E S S   T R A C K E R      ");
        System.out.println("=========================================\n");

        tracker fit_tracker = new tracker();

        workout w1 = new workout(LocalDate.now(), "running", 30, 300);
        workout w2 = new workout(LocalDate.now(), "cycling", 45, 450);
        workout w3 = new workout(LocalDate.now(), "yoga", 60, 200);
        workout w4 = new workout(LocalDate.now(), "weightlifting", 20, 100);

        fit_tracker.add_workout(w1);
        fit_tracker.add_workout(w2);
        fit_tracker.add_workout(w3);
        fit_tracker.add_workout(w4);

        int totalCals = fit_tracker.total_calories();
        System.out.println("youve completed 4 workouts today. good shit bro!");
        System.out.println("so far your total cals burned are: " + totalCals + "\n");

        goal goal1 = new goal("Hit 500 cals", 500);
        goal goal2 = new goal("Hit 1200 cals", 1200);

        fit_tracker.add_goal(goal1);
        fit_tracker.add_goal(goal2);

        fit_tracker.update_goal(goal1, totalCals);
        fit_tracker.update_goal(goal2, totalCals);

        System.out.println("====== CURRENT GOALS ======");
        for (goal g : fit_tracker.get_goals()) {
            System.out.println("Goal: " + g.getdescription() + " | Target: " + g.getTarg() 
                + " | Progress: " + g.getProg()
                + " | Achieved? " + fit_tracker.check_goal(g));
        }

        if (!fit_tracker.check_goal(goal2)) {
            System.out.println("\nGoal2 (1200 cals) not met yet? Lets push harder");
            
            workout w5 = new workout(LocalDate.now(), "HIIT Session", 30, 350);
            fit_tracker.add_workout(w5);

            int newTotal = fit_tracker.total_calories();
            fit_tracker.update_goal(goal2, w5.getCalos());

            System.out.println("After adding HIIT (350 cals), total cals = " + newTotal);
            System.out.println("Goal2 achieved now? " + fit_tracker.check_goal(goal2));
        } else {
            System.out.println("\nWow you already smashed goal2 (1200 cals). Great job!");
        }

        
        System.out.println("\nDemo complete. youre unstoppable.");
        
    }
}
