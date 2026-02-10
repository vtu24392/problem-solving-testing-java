/*
Given a list of integers, find the second highest number in the list using stream API. If there is no second highest number (all elements same or only one element), print -1.
Input Format:
First line: An integer N - the number of integers in the list.
Second line: N space-separated integers - the elements of the list.
Output Format:
Print a single integer - the second highest number. Print -1 if it does not exist.
Example 1:
Input:
5
4 2 8 1 5
Output:
5
Example 2:
Input:
3
5 5 5
Output:
-1
*/

import java.util.*;
import java.util.stream.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Optional<Integer> secondHighest =
                list.stream()
                        .distinct() // Remove duplicates
                        .sorted(Comparator.reverseOrder()) // Sort descending
                        .skip(1) // Skip highest
                        .findFirst(); // Take next element

        System.out.println(secondHighest.orElse(-1));

        sc.close();
    }
}
