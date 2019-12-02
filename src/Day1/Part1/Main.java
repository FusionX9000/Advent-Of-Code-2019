package Day1.Part1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Day1/Part1/Input");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        List<Integer> input = new ArrayList<>();

        while((st = br.readLine())!=null) {
            int mass = Integer.parseInt(st);
            input.add(mass);
        }

        Solution s = new Solution();
        System.out.println(s.fuelRequired(input));
    }
}
