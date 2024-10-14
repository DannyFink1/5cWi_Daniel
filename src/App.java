import obj.Controller;
import obj.Printer;
import obj.Ticket;
import obj.UI;

public class App {
    public static void main(String[] args) {

        UI ui = new UI();
        Ticket myTicket = ui.getTicket();
        ui.payTicket(myTicket);
        ui.showTicketInfo(myTicket);
    }
}
