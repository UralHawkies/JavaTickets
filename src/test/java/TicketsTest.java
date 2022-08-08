import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketsTest {

    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    Tickets ticket1 = new Tickets(1, 2500, "SVO", "OVB", 3);
    Tickets ticket2 = new Tickets(2, 6500, "SVO", "SVX", 3);
    Tickets ticket3 = new Tickets(3, 1525, "SVO", "SVX", 4);
    Tickets ticket4 = new Tickets(4, 4900, "OVB", "SVX", 5);
    Tickets ticket5 = new Tickets(5, 1200, "OVB", "SVX", 3);

    @BeforeEach
    public void setup() {
        manager.addTickets(ticket1);
        manager.addTickets(ticket2);
        manager.addTickets(ticket3);
        manager.addTickets(ticket4);
        manager.addTickets(ticket5);
    }

    @Test
    public void shouldFindTickets() {
        Tickets[] expected = { ticket3, ticket2 };
        Tickets[] actual = manager.searchBy("SVO", "SVX");

        assertArrayEquals(expected, actual);
    }
}
