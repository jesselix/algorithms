package li.jesse.question.leetcode;

/*
#566 Reshape the Matrix
Easy

In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input:
nums =
[[1,2],
 [3,4]]
r = 1, c = 4
Output:
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.

Example 2:
Input:
nums =
[[1,2],
 [3,4]]
r = 2, c = 4
Output:
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.

Note:
1. The height and width of the given matrix is in range [1, 100].
2. The given r and c are all positive.
 */

public class ReshapeTheMatrix
{
    public static int[][] reshapeTheMatrix(int[][] array, int r, int c)
    {
        // row
        int rows = array.length;
        // column
        int columns = array[1].length;

        if (rows * columns != r * c)
        {
            System.out.println("oh no");
        }
        else
        {
            int x = 0;

            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    if (x % c == 0)
                    {
                        System.out.println();
                    }

                    System.out.print(String.format("%3d", array[i][j]));

                    x++;
                }
            }
        }

//        System.out.println(String.valueOf(rows) + " " + String.valueOf(columns));

        return array;
    }
}
