import java.util.*;;

public class DNF_Algo {
    public static void sort1(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (mid <= high) {
            switch (arr.get(mid)) {
                case 0:
                    swap(arr, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high--);
                    break;
            }
        }
    }

    private static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        sort1(arr);
        System.out.println(arr);
    }
}