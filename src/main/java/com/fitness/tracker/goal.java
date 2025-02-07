package com.fitness.tracker;

public class goal {
    private String description;
    private int targ;
    private int prog;

    public goal(String description, int targ) {
        if (targ <= 0) {
            throw new IllegalArgumentException("targ should be positive");
        }
        this.description = description;
        this.targ = targ;
        this.prog = 0;
    }

    public goal() {}

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public int getTarg() {
        return targ;
    }

    public void setTarg(int targ) {
        if (targ <= 0) {
            throw new IllegalArgumentException("targ should be positive");
        }
        this.targ = targ;
    }

    public int getProg() {
        return prog;
    }

    public void setProg(int prog) {
        if (prog < 0) {
            throw new IllegalArgumentException("prog cant be negative");
        }
        this.prog = prog;
    }

    public void addProg(int calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("calories cant be negative");
        }
        this.prog += calories;
    }

    public boolean isAchieved() {
        return this.prog >= this.targ;
    }

    @Override
    public String toString() {
        return "goal{" +
                "description='" + description + '\'' +
                ", targ=" + targ +
                ", prog=" + prog +
                '}';
    }
}
