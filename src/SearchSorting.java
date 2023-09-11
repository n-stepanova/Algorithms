import java.util.Arrays;

public class SearchSorting {
    public static int bubbleSorting(int[] arr) {
        int x = 0;
        for (int step = 0; step <= arr.length; step++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return 0;
    }
}
