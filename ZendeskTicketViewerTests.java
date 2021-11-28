import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;


public class ZendeskTicketViewerTests {

    /**
     * Tests for TicketObj.java
     */
    @Test
    void testGetTicket() {
        TicketObj to = new TicketObj();
        Tickets tk = new Tickets();
        to.setTicket(tk);
        assertEquals(true, tk.equals(to.getTicket()));
    }

    /**
     * Tests for Tickets.java
     */
    @Test
    void testGetId() {
        Tickets tk = new Tickets();
        tk.setId(99);
        assertEquals(99, tk.getId());
    }

    /**
     * Test for Count.java
     */
    @Test
    void testGetValue() {
        Count ct = new Count();
        ct.setValue(99);
        assertEquals(99, ct.getValue());
    }

    /**
     * Test for CountRoot.java
     */
    @Test
    void testGetCount() {
        Count ct = new Count();
        CountRoot rt = new CountRoot();
        rt.setCount(ct);

        assertEquals(true, ct.equals(rt.getCount()));
    }

    /**
     * Tests for TicketList.java
     */
    @Test
    void testGetLength1() {
        List<Tickets> tl = new ArrayList<Tickets>();
        Tickets tk = new Tickets();
        Tickets kt = new Tickets();

        tl.add(tk);
        tl.add(kt);

        TicketList lt = new TicketList();
        lt.setTickets(tl);

        assertEquals(2, lt.getLength());
    }

    @Test
    void testGetLength2() {
        List<Tickets> tl = new ArrayList<Tickets>();
        TicketList lt = new TicketList();
        lt.setTickets(tl);

        assertEquals(0, lt.getLength());
    }

    @Test
    void testGetTickets1() {
        List<Tickets> tl = new ArrayList<Tickets>();
        Tickets tk = new Tickets();
        Tickets kt = new Tickets();

        tl.add(tk);
        tl.add(kt);

        TicketList lt = new TicketList();
        lt.setTickets(tl);

        assertEquals(true, tl.equals(lt.getTickets()));
    }

    @Test
    void testGetTickets2() {
        List<Tickets> tl = new ArrayList<Tickets>();
        Tickets tk = new Tickets();
        Tickets kt = new Tickets();

        tl.add(tk);
        tl.add(kt);

        TicketList lt = new TicketList();
        lt.setTickets(tl);

        assertEquals(true, tk.equals(lt.getTickets(0)));
    }

    /**
     * 
     */
}
