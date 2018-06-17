package leetcode.medium853;

import java.util.Arrays;

/**
 * 853. Car Fleet
 * https://leetcode.com/problems/car-fleet/description/
 */
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int length = position.length;
        if (length <= 1) {
            return length;
        }
        Car[] cars = new Car[length];
        for (int i = 0; i < length; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }
        Arrays.sort(cars);

        double time = (target - cars[length - 1].pos) * 1d / cars[length - 1].speed;
        int count = 1;
        for (int i = length - 2; i >= 0; i--) {
            double temp = (target - cars[i].pos) * 1d / cars[i].speed;
            if (temp > time) {
                count++;
                time = temp;
            }
        }
        return count;
    }

    class Car implements Comparable {
        int pos;
        int speed;

        public Car(int pos, int speed) {
            this.pos = pos;
            this.speed = speed;
        }

        @Override
        public int compareTo(Object o) {
            return pos - ((Car) o).pos;
        }
    }
}
