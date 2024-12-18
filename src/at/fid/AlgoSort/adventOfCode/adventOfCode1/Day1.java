package at.fid.AlgoSort.adventOfCode.adventOfCode1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import at.fid.AlgoSort.algorithms.BubbleSort;

public class Day1 {
    public void solution1(File file) {
        try {

            Scanner scanner = new Scanner(file);
            List<Integer> row1 = new ArrayList<>();
            List<Integer> row2 = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] dataList = data.split("   ");
                int r1 = Integer.parseInt(dataList[0]);
                int r2 = Integer.parseInt(dataList[1]);
                row1.add(r1);
                row2.add(r2);
            }

            BubbleSort bubbleSort = new BubbleSort();
            int[] sortedRow1 = bubbleSort.sort(row1.stream().mapToInt(i -> i).toArray());
            int[] sortedRow2 = bubbleSort.sort(row2.stream().mapToInt(i -> i).toArray());
            int totalLength = 0;
            for (int i = 0; i < sortedRow1.length; i++) {
                if (sortedRow1[i] > sortedRow2[i]) {
                    totalLength += (sortedRow1[i] - sortedRow2[i]);

                } else {
                    totalLength += (sortedRow2[i] - sortedRow1[i]);

                }
            }
            System.out.println(totalLength);
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Failed");
        }
    }

    public void solution2(File file) {
        try {

            Scanner scanner = new Scanner(file);
            List<Integer> row1 = new ArrayList<>();
            List<Integer> row2 = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] dataList = data.split("   ");
                int r1 = Integer.parseInt(dataList[0]);
                int r2 = Integer.parseInt(dataList[1]);
                row1.add(r1);
                row2.add(r2);
            }
            int totalScore = 0;

            for (int i = 0; i < row1.size(); i++) {
                int counter = 0;
                for (int e = 0; e < row2.size(); e++) {

                    if ((int) row1.get(i) == (int) row2.get(e)) {
                        counter++;
                    }
                }
                totalScore += (counter * row1.get(i));

            }

            System.out.println(totalScore);
        } catch (FileNotFoundException e) {
            System.out.println("Failed");
        }
    }

}
