package at.fid.slot;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] characters = { "a", "b", "c", "J", "Q", "K", "S", };
        List<Integer> chances = new ArrayList();

        chances.add(22);
        chances.add(22);
        chances.add(21);
        chances.add(10);
        chances.add(10);
        chances.add(10);
        chances.add(5);

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("|------------------------|");
        System.out.println("| Mega Epic Lucker Slot! |");
        System.out.println("|by Danny Fink           |");
        System.out.println("|------------------------|");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Was wollen Sie einzahlen?");

        int input = scanner.nextInt();
        System.out.println(" ");
        System.out.println("Eingezahlt: " + input + " Euro");
        showSlot();

    }

    public static void showSlot() {

        Scanner scanner = new Scanner(System.in);

        int n = 100;
        Random random = new Random();

        for (int e = 0; e < 3; e++) {
            List<String> walze = new ArrayList();
            for (int i = 0; i < 3; i++) {
                int randomInt = random.nextInt(100);

                if (randomInt > 0 && randomInt <= 22) {
                    walze.add("a");
                } else if (randomInt > 22 && randomInt <= 44) {
                    walze.add("b");

                } else if (randomInt > 44 && randomInt <= 65) {
                    walze.add("c");

                } else if (randomInt > 65 && randomInt <= 75) {
                    walze.add("J");

                } else if (randomInt > 75 && randomInt <= 85) {
                    walze.add("Q");

                } else if (randomInt > 85 && randomInt <= 95) {

                    walze.add("K");

                } else if (randomInt > 95 && randomInt <= 100) {
                    walze.add("S");

                }
            }
            System.out.println("walze: " + walze);
        }

        System.out.println("Respin?");
        String input2 = scanner.nextLine();
        if (input2 != null) {
            showSlot();
        }

    }
}
