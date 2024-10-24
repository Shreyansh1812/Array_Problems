import java.util.*;

public class Leader_Array {
    public static List<Integer> superiorElements(int[] a) {
        int n = a.length;
        List<Integer> list1 = new ArrayList<>();
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible value
        
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > max) {
                list1.add(a[i]);
                max = a[i];
            }
        }

        // Print the superior elements in the order they were found
        for (int j = list1.size() - 1; j >= 0; j--) {
            System.out.println(list1.get(j));
        }

        return list1; // Return the list if needed
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.print("Superior elements: ");
        superiorElements(arr);
    }
}
