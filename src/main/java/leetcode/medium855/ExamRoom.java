package leetcode.medium855;


import java.util.TreeSet;

/**
 * 855. Exam Room
 * https://leetcode.com/problems/exam-room/description/
 */
class ExamRoom {
    TreeSet<Integer> set = new TreeSet();
    int last;

    public ExamRoom(int N) {
        last = N - 1;
    }

    public int seat() {
        int size = set.size();
        if (size == 0) {
            set.add(0);
            return 0;
        }

        int max = 0;
        int cand = 0;
        int prev = -1;
        if (last != set.last()) {
            cand = last;
            max = last - set.last();
        }
        for (int num : set) {
            if (prev >= 0 && (num - prev) / 2 > max) {
                cand = (num + prev) / 2;
                max = (num - prev) / 2;
            }
            prev = num;
        }
        if (set.first() >= max) {
            cand = 0;
        }

        set.add(cand);
        return cand;
    }

    public void leave(int p) {
        set.remove(p);
    }
}
