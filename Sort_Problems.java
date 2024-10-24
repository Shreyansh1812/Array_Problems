import java.util.*;

public class Sort_Problems {
    public static void check(int[] arr) {
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            System.out.print(0 + " ");
        }
        for (int i = 0; i < count1; i++) {
            System.out.print(1 + " ");
        }
        for (int i = 0; i < count2; i++) {
            System.out.print(2 + " ");
        }
        System.out.println(); // add a newline at the end
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 0, 1, 2, 0, 1};
        check(arr);
        
    }
}