package leetcode.easy690;

import java.util.*;

/**
 * 690. Employee Importance
 * https://leetcode.com/problems/employee-importance/description/
 */
class Solution {

    public int getImportance(List<Employee> employees, int id) {

        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        int sum = 0;
        while (!q.isEmpty()) {
            id = q.poll();
            Employee e = map.get(id);
            sum += e.importance;
            q.addAll(e.subordinates);
        }
        return sum;
    }

    public static class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;

        public Employee() {
        }

        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }
}
