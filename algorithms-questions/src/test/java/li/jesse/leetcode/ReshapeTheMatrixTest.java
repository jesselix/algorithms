package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class ReshapeTheMatrixTest
{
    int [][] num = new int [4][3];

    public void initArray()
    {
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;

        num[1][0] = 4;
        num[1][1] = 5;
        num[1][2] = 6;

        num[2][0] = 7;
        num[2][1] = 8;
        num[2][2] = 9;

        num[3][0] = 10;
        num[3][1] = 11;
        num[3][2] = 12;
    }

    @Test
    public void testReshapeTheMatrix()
    {
        initArray();

        ReshapeTheMatrix.reshapeTheMatrix(num, 3, 4);
    }
}
