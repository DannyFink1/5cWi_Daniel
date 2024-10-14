package obj;

public class UI {
    private Controller controller;

    public UI() {
        this.controller = new Controller();
    }

    public Ticket getTicket() {
        return controller.createTicket();
    }

    public void payTicket(Ticket ticket) {
        controller.payTicket(ticket);
    }

    public void showTicketInfo(Ticket ticket) {
        System.out.println("-----------");
        System.out.println("ID: " + ticket.getId());
        System.out.println("Erstellt am: " + ticket.getCreatedTimestamp());

        if (ticket.getPayedTimestamp() != 0) {
            System.out.println("Bezahlt:" + ticket.getPayedTimestamp());
        }
    }

}
