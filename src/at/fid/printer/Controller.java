package at.fid.obj;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Ticket> tickets;
    private Printer printer;

    public Controller() {
        this.tickets = new ArrayList<>();
        this.printer = new Printer();
    }

    public Ticket createTicket() {
        Ticket ticket = new Ticket();
        this.tickets.add(ticket);
        printer.printTicket(ticket);
        return ticket;
    }

    public void payTicket(Ticket ticket) {
        ticket.setPayedTimestamp(System.currentTimeMillis());
    }

    public double getPrice(Ticket ticket) {
        if (ticket.getPayedTimestamp() == 0 && tickets.contains(ticket)) {
            // Würde nur Sinn machen, wenn die Tickets ausserhalb der Runtime gehalten wird.
            // long activeTime = System.currentTimeMillis() - ticket.getCreatedTimestamp();
            // long moneyToPay = activeTime / (1000 * 60 * 60 * 60);
            // System.out.println(activeTime);
            // System.out.println(moneyToPay);
            return ticket.getTicketPrice();

        } else {
            System.out.println("Ticket ist bereits bezahlt.");
            return -1.0;
        }
    }

    public void setPrice(Ticket ticket, double newValue) {
        ticket.setTicketPrice(newValue);
    }

}
