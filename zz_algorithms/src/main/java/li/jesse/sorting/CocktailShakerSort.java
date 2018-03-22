package li.jesse.sorting;

public class CocktailShakerSort {

    public static int[] cocktailShakerSort(int[] array) {
        int j, temp, length = array.length;
        int left = 0, right = length - 1;

        while (left < right) {
            for (j = left; j < right; j++)
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            right--;
            for (j = right; j > left; j--)
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            left++;
        }

        return array;
    }
}
