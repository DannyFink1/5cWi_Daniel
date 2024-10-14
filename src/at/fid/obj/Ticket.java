package at.fid.obj;

import java.util.Random;

public class Ticket {
    private int id;
    private long createdTimestamp;
    private long payedTimestamp;
    private Random random = new Random();

    public Ticket() {
        this.id = random.nextInt();
        this.createdTimestamp = System.currentTimeMillis();
        this.payedTimestamp = 0;

    }

    public int getId() {
        return id;
    }

    public long getPayedTimestamp() {
        return payedTimestamp;
    }

    public long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setPayedTimestamp(long payedTimestamp) {
        this.payedTimestamp = payedTimestamp;
    }

    @Override
    public String toString() {
        return "Ticket-ID: " + getId() + "\nCreatedTimestamp: " + getCreatedTimestamp() + "\nPayedTimestamp: "
                + getPayedTimestamp();
    }
}
