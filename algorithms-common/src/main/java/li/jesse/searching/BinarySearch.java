package li.jesse.searching;

public class BinarySearch {

    public enum Operation {
        EQUAL,
        GREATER,
        GREATER_EQUAL,
        LESS,
        LESS_EQUAL
    }

    public enum FirstLast {
        FIRST,
        LAST
    }

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


    public static int findElement(int[] array, int key, FirstLast firstLast, Operation operation) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        int case1 = 0;
        boolean compareKeyWithArrayMid = false;

        if (FirstLast.LAST.equals(firstLast) && Operation.LESS.equals(operation)) {
            case1 = 0;
        } else if (FirstLast.LAST.equals(firstLast) && Operation.LESS_EQUAL.equals(operation)) {
            case1 = 1;
        } else if (FirstLast.FIRST.equals(firstLast) && Operation.GREATER.equals(operation)) {
            case1 = 2;
        } else if (FirstLast.FIRST.equals(firstLast) && Operation.GREATER_EQUAL.equals(operation)) {
            case1 = 3;
        } else if (FirstLast.FIRST.equals(firstLast) && Operation.EQUAL.equals(operation)) {
            case1 = 4;
        } else if (FirstLast.LAST.equals(firstLast) && Operation.EQUAL.equals(operation)) {
            case1 = 5;
        }

        while (left <= right) {
            mid = (left + right) / 2;

            if (case1 == 0 || case1 == 2 || case1 == 4) {
                compareKeyWithArrayMid = compareKeyWithArrayMid = (key <= array[mid]);
            } else {
                compareKeyWithArrayMid = (key < array[mid]);
            }

            if (compareKeyWithArrayMid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (case1 == 0 || case1 == 2) {
            return right;
        } else if (case1 == 1 || case1 == 3) {
            return left;
        } else if (case1 == 4) {
            if (left < array.length && array[left] == key) {
                return left;
            }
        } else if (case1 == 5) {
            if (right >= 0 && array[right] == key) {
                return right;
            }
        }

        return -1;
    }

}
