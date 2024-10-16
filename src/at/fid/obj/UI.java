package at.fid.obj;

import java.util.Scanner;

public class UI {
    private Controller controller;
    private Scanner scanner = new Scanner(System.in);

    public UI() {
        this.controller = new Controller();
    }

    public Ticket getTicket() {
        return controller.createTicket();
    }

    public void insertTicket(Ticket ticket) {
        if (controller.getPrice(ticket) != -1) {

            System.out.println("Aktueller Preis: " + controller.getPrice(ticket) + " Euro");
            redundantPayingQuestion();
            redundantPaying(ticket);
        }

    }

    public void redundantPayingQuestion() {
        System.out.println("\n Wollen Sie das Ticket bezahlen? (1,0)");
        int input = scanner.nextInt();
        if (input == 1) {
            return;

        } else if (input == 0) {
            System.out.println("Ticket wird wieder ausgegeben");
            return;
        } else {
            System.out.println("Falsche Eingabe, veruschen Sie es erneut!");
            redundantPayingQuestion();

        }
    }

    public void redundantPaying(Ticket ticket) {
        System.out.println("Werfen Sie ihr Geld ein!");
        double input = scanner.nextDouble();

        if (input > controller.getPrice(ticket)) {
            double spareMoney = input - controller.getPrice(ticket);
            System.out.println("Ticket bezahlt!");
            System.out.println("Restbetrag: " + spareMoney + " Euro");
            controller.setPrice(ticket, 0.0);
            controller.payTicket(ticket);
            return;
        } else if (input == controller.getPrice(ticket)) {
            System.out.println("Ticket bezahlt!");
            controller.setPrice(ticket, 0.0);
            controller.payTicket(ticket);
            return;
        } else {
            double spareAmount = controller.getPrice(ticket) - input;
            System.out.println("Restbetrag: " + spareAmount + " Euro");
            controller.setPrice(ticket, controller.getPrice(ticket) - input);
            redundantPaying(ticket);
        }
    }
}
