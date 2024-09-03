package com.internsip.codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the number of subjects
		System.out.print("Enter the number of subjects: ");
		int numSubjects = scanner.nextInt();

		int totalMarks = 0;

		// Loop to input marks for each subject and calculate total marks
		for (int i = 1; i <= numSubjects; i++) {
			System.out.print("Enter marks for subject " + i + " (out of 100): ");
			int marks = scanner.nextInt(); // Read marks for each subject

			// Validate that marks are between 0 and 100
			if (marks < 0 || marks > 100) {
				System.out.println("Invalid input. Marks should be between 0 and 100.");
				
				// Decrement i to repeat the input for this subject
				i--; 
				continue;
			}

			// Add the marks to totalMarks
			totalMarks += marks;
		}

		// Calculate average percentage
		double averagePercentage = (double) totalMarks / numSubjects;

		// Determine the grade based on the average percentage
		String grade;
		if (averagePercentage >= 90) {
			grade = "A";
		} else if (averagePercentage >= 80) {
			grade = "B";
		} else if (averagePercentage >= 70) {
			grade = "C";
		} else if (averagePercentage >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Percentage: " + averagePercentage + "%");
		System.out.println("Grade: " + grade);

		scanner.close();
	}
}
