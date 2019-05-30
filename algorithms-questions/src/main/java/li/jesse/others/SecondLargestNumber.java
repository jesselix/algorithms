package li.jesse.others;

public class SecondLargestNumber {

    public static int secondLargestNumber(int[] arr) {
        int max = 0, second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }
}
