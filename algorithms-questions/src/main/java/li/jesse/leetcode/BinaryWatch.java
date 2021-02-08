package li.jesse.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();

        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
//                if (Integer.bitCount(h * 64 + m) == num) {
//                    times.add(String.format("%d:%02d", h, m));
//
//                    System.out.println(String.format("%d:%02d", h, m));
//                }

                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    times.add(String.format("%d:%02d", h, m));

                    System.out.println(String.format("%d:%02d", h, m));
                }
            }
        }

        return times;
    }
}
