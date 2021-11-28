/**
 * 
 * A list of tickets object
 * 
 */
import java.util.*;

public class TicketList {
    public List<Tickets> tickets;

    public List<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }

    public Tickets getTickets(int i) {
        return tickets.get(i);
    }

    public Integer getLength() {
        return tickets.size();
    }
}
