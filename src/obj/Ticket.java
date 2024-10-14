package obj;

import java.util.Random;

public class Ticket {
    private int id;
    private long createdTimestamp;
    private long payedTimestamp;
    private Random random = new Random();

    public Ticket() {
        this.id = random.nextInt();
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
}
