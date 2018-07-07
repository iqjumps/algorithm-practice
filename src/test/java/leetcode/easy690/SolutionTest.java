package leetcode.easy690;

import org.junit.Test;

import java.util.Arrays;

import static leetcode.easy690.Solution.*;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void getImportance() throws Exception {
        Solution solution = new Solution();
        Employee e1 = new Employee(1, 5, Arrays.asList(2,3));
        Employee e2 = new Employee(2, 3, Arrays.asList());
        Employee e3 = new Employee(3, 3, Arrays.asList());
        assertEquals(11, solution.getImportance(Arrays.asList(e1,e2,e3), 1));
    }

}