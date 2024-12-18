package at.fid.AlgoSort.adventOfCode.adventOfCode2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import at.fid.AlgoSort.algorithms.BubbleSort;

public class Day2 {
    public void solution1(File file) {
        try {
            int counterAll = 0;
            int inc = 2;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] dataList = data.split(" ");
                int counter = 0;

                for (int i = 0; i < dataList.length - 1; i++) {
                    int v1 = Integer.parseInt(dataList[i]);
                    int v2 = Integer.parseInt(dataList[i + 1]);
                    int result = check(v1, v2, inc);
                    if (result == 1) {
                        inc = 0;
                        counter++;
                    } else if (result == 2) {
                        inc = 1;
                        counter++;
                    } else {
                        counter = 0;
                        break;
                    }

                }
                if (counter != 0) {
                    counterAll++;
                }

            }
            System.out.println(counterAll);

        } catch (FileNotFoundException e) {
            System.out.println("Failed");
        }
    }

    public int check(int data1, int data2, int inc, int rule1) {

        if (data1 > data2 && inc == 0 || data1 > data2 && inc == 2) {
            if (data1 <= data2 + 3) {
                return 1;
            } else {
                return 0;
            }
        } else if (data1 < data2 && inc == 1 || data1 < data2 && inc == 2) {
            if (data2 <= data1 + 3) {
                return 2;
            } else {
                return 0;
            }
        } else if (data2 <= data1 + 3) {
        
        else {
            return 0;
        }
    }
}
