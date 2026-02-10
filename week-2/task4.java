/*

Given a list of persons, each with a name (String) and age (integer).Sort the persons alphabetically by name using method references.Filter the persons older than a given age limit using a static method reference.Convert all names to uppercase using an instance method reference.
Input Format
The first line contains an integer n — the number of persons.
The next n lines each contain a string name and an integer age separated by a space.
The last line contains an integer ageLimit — the age threshold for filtering.
Output Format
First line: sorted names (alphabetically), space-separated.
Second line: names of persons older than ageLimit, space-separated, in the order they appear in the input.
Third line: all names in uppercase, space-separated, in the original order.
Name contains only uppercase and lowercase English letters
Sample Input
3
Alice 23
Bob 30
Charlie 25
24
Sample Output
Alice Bob Charlie
Bob Charlie
ALICE BOB CHARLIE


*/

import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Static method for filtering
    public static boolean isOlderThan(Person p, int limit) {
        return p.age > limit;
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();

        // -------- 1. Sort alphabetically by name --------
        List<String> sortedNames = persons.stream()
                .map(Person::getName)
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(String.join(" ", sortedNames));

        // -------- 2. Filter persons older than ageLimit --------
        List<String> filteredNames = persons.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit)) // static method reference logic
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(String.join(" ", filteredNames));

        // -------- 3. Convert names to uppercase --------
        List<String> upperNames = persons.stream()
                .map(Person::getName)
                .map(String::toUpperCase) // instance method reference
                .collect(Collectors.toList());

        System.out.println(String.join(" ", upperNames));

        sc.close();
    }
}
