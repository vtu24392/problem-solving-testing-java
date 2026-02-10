import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {7, 10, 4, 3, 20, 15};

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        if(k > 0 && k <= arr.length) {
            System.out.println("Kth smallest element: " + arr[k - 1]);
        } else {
            System.out.println("Invalid K");
        }

        sc.close();
    }
}
