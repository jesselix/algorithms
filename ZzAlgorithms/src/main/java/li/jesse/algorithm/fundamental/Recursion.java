package li.jesse.algorithm.fundamental;

public class Recursion
{
    public static void hanoiMoveDish(int level, char from, char inter, char to)
    {
        if (level == 1)
        {
            System.out.println("从" + from + "移动盘子" + level + "号到" + to);
        }
        else
        {
            hanoiMoveDish(level - 1, from, to, inter);
            System.out.println("从" + from + "移动盘子" + level + "号到" + to);
            hanoiMoveDish(level - 1, inter, from, to);
        }
    }

    public static int fibonacci(int i)
    {
//        if (i <= 0)
//        {
//            return -1;
//        }
//        else if (i == 1 || i == 2)
//        {
//            return i - 1;
//        }
        if(i==1){
            return 1;
        }

        if(i==2){
            return 1;
        }
        else
        {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }

    }
}




