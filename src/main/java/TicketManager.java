import java.util.Arrays;

public class TicketManager {

    private TicketRepository repo;

    public TicketManager(TicketRepository repo) {
        this.repo = repo;
    }

    public void addTickets(Tickets ticket) {
        repo.saveTickets(ticket);
    }

    public Tickets[] searchBy(String airportFrom, String airportTo) {
        Tickets[] result = new Tickets[0];
        for (Tickets ticket : repo.getTickets()) {
            if (matches(ticket, airportFrom, airportTo)) {
                Tickets[] tmp = new Tickets[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(Tickets ticket, String airportFrom, String airportTo) {
        if (ticket.getAirportFrom().contains(airportFrom) && ticket.getAirportTo().contains(airportTo)) {
            return true;
        } else {
            return false;
        }
    }
}
