package li.jesse.leetcode;

import org.junit.Test;

public class StudentAttendanceRecordITest {

    @Test
    public void testStudentAttendanceRecordI() {
        String s1 = "PPALLP";
        String s2 = "PPALLL";
        System.out.println(StudentAttendanceRecordI.checkRecord(s1));
        System.out.println(StudentAttendanceRecordI.checkRecord(s2));
    }
}
