package at.fid.obj;

import at.fid.obj.Printer;
import at.fid.obj.Ticket;
import at.fid.obj.UI;

public class App {
    public static void main(String[] args) {
        UI ui = new UI();
        Ticket myTicket = ui.getTicket();
        myTicket.getPayedTimestamp();
        ui.insertTicket(myTicket);
        ui.insertTicket(myTicket);
    }
}
