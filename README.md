## By: Michael O'Brien

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

#### **If you have Maven downloaded manually**
Run this command:
```bash
mvn clean install
```
This will compile the project and run all tests.

#### **If you are running Maven from a custom location like i am **
Run something like this command:
```bash
& "C:\Users\mobri\Documents\FitnessTracker\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd" clean install
```
**You would simply `cd` into the folder that you have your project in, then change `C:\Users\mobri\Documents\FitnessTracker\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd` to match wherever you have the Maven folder, then run the entire command.**

**This is simply an alternative to needing to point Maven in the proper environment variables—in other words, I'm lazy.**

---

### **2️ Run the Fitness Tracker**

#### **If you have Maven downloaded normally**
Run this command:
```bash
mvn clean compile exec:java -Dexec.mainClass=com.fitness.tracker.Main
```

#### **If you are running Maven from a custom location like me again**
Run something like this command:
```bash
& "C:\Users\mobri\Documents\FitnessTracker\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd" clean compile exec:java "-Dexec.mainClass=com.fitness.tracker.Main"
```

**Same thing—you would simply `cd` into the folder that you have your project in, then change `C:\Users\mobri\Documents\FitnessTracker\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd` to match wherever you have the Maven folder, then run the entire command.**

---

## What's In The Project?

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

## Main.java Output

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

## GitHub Actions 

In order to see all tests pass without needing to download the repo, simply press **Actions** and click a workflow run (they're all the same, just different commits). Then click **Re-run all jobs** to verify I'm not lyin to ya or just check the green check next to the build so you know it's all good!

---

## Dependencies

This project uses the following dependencies, which Maven will automatically install:

- **JUnit 5** – Used for unit testing.
- **Maven Surefire Plugin** – Runs the JUnit tests (included in Maven).
- **Obviously, you need Maven and Java to do this.**

You can find all this located in the `pom.xml` file.




## ps: i love making the readme its the best part haha, im very proud of my readme's lol.