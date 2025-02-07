By: Michael O'Brien

## 📚 Project Overview

- Log workouts (type, duration, calories burned).
- Track total calories burned.
- Set fitness goals (e.g., burn 1200 calories).
- Check if goals are met.
- Run tests automatically to make sure everything works.
- Uses **JUnit 5 for testing** and **GitHub Actions for automation**.

---

## How to Run It

### **1 Install and Build the Project**

Run this command:

```bash
& "C:\Users\mobri\Documents\FitnessTracker\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd" clean install
```
**you would simply cd into the folder that you have your project in, then change C:\Users\mobri\Documents\FitnessTracker\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd" to match where ever you have the maven folder then run enitre command.**\

**this is simply an alternative to needing to point maven in the proper enviornment variables in other words im lazy.**\


---

### **2️ Run the Fitness Tracker**

Run this command:

```bash
& "C:\Users\mobri\Documents\FitnessTracker\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd" clean compile exec:java "-Dexec.mainClass=com.fitness.tracker.Main"
```

 **same thing you would simply cd into the folder that you have your project in, then change C:\Users\mobri\Documents\FitnessTracker\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd" to match where ever you have the maven folder then run enitre command.**\


---

## Whats In The Project?

```
FitnessTracker/
│── src/
│   ├── main/java/com/fitness/tracker/
│   │   ├── Main.java        
│   │   ├── tracker.java     
│   │   ├── workout.java     
│   │   ├── goal.java        
│   ├── test/java/com/fitness/tracker/
│   │   ├── tracker_test.java 
│   │   ├── workout_test.java 
│   │   ├── goal_test.java    
│── logs/                    
│── pom.xml                   
│── README.md                 
│── .github/workflows/ci.yml  
```

---

## Output

```
=========================================
        D O P E         A S S        
     F I T N E S S   T R A C K E R
=========================================

you've completed 4 workouts today. good shit bro!
so far your total cals burned are: 1050

====== CURRENT GOALS ======
Goal: Hit 500 cals | Target: 500 | Progress: 1050 | Achieved? true
Goal: Hit 1200 cals | Target: 1200 | Progress: 1050 | Achieved? false

Goal2 (1200 cals) not met yet? Lets push harder
After adding HIIT (350 cals), total cals = 1400
Goal2 achieved now? true

Demo complete. you're unstoppable.
```

---

## Github actions 

in order to see all tests pass without needing to download the repo, simply press actions and click a workflow run "theyre all the same just different commits" and click re-run all jobs to verify i aint lyin to ya but you can just simply see the green check next to the build so you know its all good!
