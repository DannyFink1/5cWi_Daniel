package at.fid.AlgoSort.adventOfCode.adventOfCode1;

import java.io.File;

public class Day1Main {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\Danny\\Documents\\GitHub\\5cWI\\5cWI\\src\\at\\fid\\AlgoSort\\adventOfCode\\adventOfCode1\\file.txt");
        Day1 a = new Day1();

        a.solution1(file);
        a.solution2(file);

    }
}
