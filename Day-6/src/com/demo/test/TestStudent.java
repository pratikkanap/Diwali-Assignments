package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.beans.Student;
import com.demo.exception.LowAttendanceException;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> slist = new ArrayList<>();

        slist.add(new Student(1, "Pratik", "IT", 85, 92));
        slist.add(new Student(4, "Prakash", "IT", 90, 95));
        slist.add(new Student(5, "Amit", "CS", 70, 72));
        slist.add(new Student(7, "Arjun", "MECH", 65, 67));
        slist.add(new Student(10, "Dev", "ENTC", 50, 76));  

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
            for (Student s : slist) {
                oos.writeObject(s);
            }
            System.out.println(" Students serialized successfully to students.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
                List<Student> loadedList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.txt"))) {
            while (true) { 
                try {
                    Student s = (Student) ois.readObject();
                    loadedList.add(s);
                } catch (EOFException e) {
                    break; 
            }
            System.out.println("\n Students deserialized successfully from students.txt");
            }
        }
            catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Collections.sort(loadedList);
        System.out.println("\n Students sorted by attendance (descending):");
        for (Student s : loadedList) {
            System.out.println(s);
        }        // Test grade calculation with exception handling
        System.out.println("\n Grade Calculation:");
        for (Student s : loadedList) {
            try {
                String grade = s.calculateGrade();
                System.out.println(s.getRollno() + " -> Grade: " + grade);
            } catch (LowAttendanceException e) {
                System.out.println(s.getRollno() + " -> " + e.getMessage());
            }
        }

        }
}