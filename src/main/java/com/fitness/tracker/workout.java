package com.fitness.tracker;

import java.time.LocalDate;

public class workout {
    private LocalDate date;
    private String type;
    private int dur;     // minutes
    private int calos;   // burned

    public workout(LocalDate date, String type, int dur, int calos) {
        if (dur <= 0) {
            throw new IllegalArgumentException("duration gotta be positive");
        }
        if (calos < 0) {
            throw new IllegalArgumentException("calories cant be negative");
        }
        this.date = date;
        this.type = type;
        this.dur = dur;
        this.calos = calos;
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

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        if (dur <= 0) {
            throw new IllegalArgumentException("duration gotta be positive");
        }
        this.dur = dur;
    }

    public int getCalos() {
        return calos;
    }

    public void setCalos(int calos) {
        if (calos < 0) {
            throw new IllegalArgumentException("calories cant be negative");
        }
        this.calos = calos;
    }

    @Override
    public String toString() {
        return "workout{" +
                "date=" + date +
                ", type='" + type + '\'' +
                ", dur=" + dur +
                ", calos=" + calos +
                '}';
    }
}
