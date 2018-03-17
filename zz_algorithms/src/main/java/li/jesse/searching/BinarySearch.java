package li.jesse.searching;

public class BinarySearch {

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (key < array[mid]) {
                right = mid - 1;
            } else if (key > array[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int findFirstElementEqualToKey(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (key <= array[mid]) {
                right = mid - 1;
            } else {//arr[mid] < key
                left = mid + 1;
            }
        }
        //arr[right] < key <= arr[left]
        //right是最后一个小于key的
        //left是第一个大于等于key的
        if (left < array.length && array[left] == key) {
            return left;
        }
        return -1;
    }

    public static int findLastElementEqualToKey(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (key < array[mid]) {
                right = mid - 1;
            } else {//arr[mid] <= key
                left = mid + 1;
            }
        }
        //arr[right] <= key < arr[left]
        //right是最后一个小于等于key的
        //left是第一个大于key的
        if (right >= 0 && array[right] == key) {
            return right;
        }
        return -1;
    }
}
