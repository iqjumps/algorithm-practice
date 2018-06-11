package leetcode.easy232;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {
    @Test
    public void test() throws Exception {
        MyQueue q = new MyQueue();
        assertEquals(true, q.empty());
        q.push(1);
        assertEquals(false, q.empty());
        assertEquals(1, q.peek());

        q.push(2);
        q.push(3);
        assertEquals(1, q.peek());
        assertEquals(1, q.pop());
        assertEquals(2, q.pop());
        assertEquals(3, q.pop());
        assertEquals(true, q.empty());

    }

}