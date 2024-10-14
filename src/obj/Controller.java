package obj;

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
        System.out.println("-------------");
        System.out.println("Ticket bezahlt!");
        System.out.println("ID: " + ticket.getId());
    }

}
