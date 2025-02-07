package com.fitness.tracker;

import java.time.LocalDate;


public class workout {
    private LocalDate date;
    private String type;
    private int duration;   // minutes
    private int calories;   // burned

    public workout(LocalDate date, String type, int duration, int calories) {
        if (duration <= 0) {
            throw new IllegalArgumentException("duration must be positive");
        }
        if (calories < 0) {
            throw new IllegalArgumentException("calories cannot be negative");
        }
        this.date = date;
        this.type = type;
        this.duration = duration;
        this.calories = calories;
    }

    public workout() {}

    public LocalDate getdate() {
        return date;
    }

    public void setdate(LocalDate date) {
        this.date = date;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public int getduration() {
        return duration;
    }

    public void setduration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("duration must be positive");
        }
        this.duration = duration;
    }

    public int getcalories() {
        return calories;
    }

    public void setcalories(int calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("calories cannot be negative");
        }
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "workout{" +
                "date=" + date +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                ", calories=" + calories +
                '}';
    }
}
