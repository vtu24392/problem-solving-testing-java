/*

A list of students is given, where each student has a name and total marks. The task is to sort students based on marks in descending order. If two students have the same marks, they must be sorted alphabetically by name. Finally, collect the top K students using Java Streams and Collectors API.

Input Format

The first line contains an integer N, the number of students.
The next N lines contain student details in the format:
name marks

The last line contains an integer K, representing the number of top students to display.

Output Format

Print the names of the top K students in sorted order, separated by space.

Sample Input
6
Arun 85
Bala 92
Charan 85
Divya 95
Esha 92
Farhan 88
3
Sample Output
Divya Bala Esha

*/

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        int k = sc.nextInt();

        List<String> topStudents = students.stream()
                // Sort by marks DESC, then name ASC
                .sorted(Comparator.comparing(Student::getMarks).reversed()
                        .thenComparing(Student::getName))
                // Take top K
                .limit(k)
                // Extract names
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(String.join(" ", topStudents));

        sc.close();
    }
}
