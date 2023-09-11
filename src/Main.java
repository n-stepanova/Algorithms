import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[] {12, 6, 4, 1, 15, 10};
        int[] arr = new int[] {12, 6, 4, 1, 15};
        System.out.println("Array for sorting: " + Arrays.toString(arr));
        SearchSorting.bubbleSorting(arr);
    }
}
