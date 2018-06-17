package leetcode.medium855;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExamRoomTest {
    @Test
    public void test() {
        ExamRoom examRoom = new ExamRoom(10);
        assertEquals(0, examRoom.seat());
        assertEquals(9, examRoom.seat());
        assertEquals(4, examRoom.seat());
        assertEquals(2, examRoom.seat());
        examRoom.leave(4);
        assertEquals(5, examRoom.seat());

        examRoom = new ExamRoom(2);
        assertEquals(0, examRoom.seat());
        assertEquals(1, examRoom.seat());
    }
}