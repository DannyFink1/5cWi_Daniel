package at.fid.AlgoSort;

import java.io.File;

import at.fid.AlgoSort.data.adventOfCode1.AdventOfCode;

public class AdventOfCodeMain {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Danny\\Documents\\GitHub\\5cWI\\5cWI\\src\\at\\fid\\AlgoSort\\file.txt");
        AdventOfCode a = new AdventOfCode();

        a.solution1(file);
        a.solution2(file);

    }
}
