import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 5, 8, 12, 16, 23, 38}; // Sorted array

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } 
            else if(arr[mid] < key) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        if(!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
