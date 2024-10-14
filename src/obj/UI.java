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

    }

}
