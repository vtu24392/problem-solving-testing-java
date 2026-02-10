/*

Write the following methods that return a lambda expression performing a specified action:
PerformOperation isOdd(): The lambda expression must return  true if a number is odd or  false if it is even.
PerformOperation isPrime(): The lambda expression must return  true if a number is prime or  false if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true  if a number is a palindrome or  false if it is not.
Input Format
Input is handled for you by the locked stub code in your editor.
Output Format
The locked stub code in your editor will print  lines of output.
Sample Input
The first line contains an integer,  (the number of test cases).
The  subsequent lines each describe a test case in the form of  space-separated integers:
The first integer specifies the condition to check for ( for Odd/Even,  for Prime, or  for Palindrome). The second integer denotes the number to be checked.
Sample Input:
5
1 4
2 5
3 898
1 3
2 12
Sample Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE


*/

import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public PerformOperation isOdd() {
        return (a) -> a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (a) -> {
            String str = Integer.toString(a);
            String rev = new StringBuilder(str).reverse().toString();
            return str.equals(rev);
        };
    }

    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath obj = new MyMath();

        int T = sc.nextInt();

        while (T-- > 0) {
            int ch = sc.nextInt();
            int num = sc.nextInt();

            PerformOperation op;

            switch (ch) {
                case 1:
                    op = obj.isOdd();
                    System.out.println(obj.checker(op, num) ? "ODD" : "EVEN");
                    break;

                case 2:
                    op = obj.isPrime();
                    System.out.println(obj.checker(op, num) ? "PRIME" : "COMPOSITE");
                    break;

                case 3:
                    op = obj.isPalindrome();
                    System.out.println(obj.checker(op, num) ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }

        sc.close();
    }
}
