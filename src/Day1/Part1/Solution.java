package Day1.Part1;

import java.util.List;

public class Solution {
    public int fuelRequired(List<Integer> listOfMass) {
        int result = 0;
        for(int mass : listOfMass) result+=helper(mass);
        return result;
    }

    public int helper(int mass) {
        return (mass/3)-2;
    }
}
