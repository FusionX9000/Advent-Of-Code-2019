package Day1.Part2;

import java.util.List;

public class Solution {
    public int fuelRequired(List<Integer> inputs) {
        Day1.Part1.Solution part1 = new Day1.Part1.Solution();
        int result = 0;
        for(int mass : inputs) result+=helper(mass);
        return result;
    }
    public int helper(int mass) {
        if(mass<=0) return 0;
        int fuel = Math.max(0,(mass/3) - 2);
        return helper(fuel) + fuel;
    }
}
