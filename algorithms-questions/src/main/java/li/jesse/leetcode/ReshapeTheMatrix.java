package li.jesse.leetcode;

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
