package li.jesse.leetcode;

public class StudentAttendanceRecordI {

    public static boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
                if (countA > 1) return false;
            } else if (s.charAt(i) == 'L') {
                countL++;
                if (countL > 2) return false;
            }
        }
        return true;
    }
}
