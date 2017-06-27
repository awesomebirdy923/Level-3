package com.league.level3.classroom;
import java.util.ArrayList;

public class Classroom {

	ArrayList<Student> nerds;

	public Classroom() {
		nerds = new ArrayList<Student>();
		nerds.add(new Student(9000, "Rabby"));
		nerds.add(new Student(10, "Jooey"));
		System.out.println("The class has " + getAverageIQ() + " average IQ points.");
	}

	public static void main(String[] args) {
		new Classroom();
	}

	int getAverageIQ() {
		int total = 0;
		for (Student s : nerds) {
			total += s.subjectiveIntellegenceLevel;
		}
		return total / nerds.size();
	}

}
