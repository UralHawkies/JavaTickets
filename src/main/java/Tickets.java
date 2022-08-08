import java.util.Objects;

public class Tickets implements Comparable<Tickets> {

    protected int id;
    protected int ticketPrice;
    protected String airportFrom;
    protected String airportTo;
    protected int flightTime;

    public Tickets(int id, int ticketPrice, String airportFrom, String airportTo, int flightTime) {
        this.id = id;
        this.ticketPrice = ticketPrice;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.flightTime = flightTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public int compareTo(Tickets o) {
        if (this.ticketPrice < o.ticketPrice) {
            return -1;
        } else if (this.ticketPrice > o.ticketPrice) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tickets tickets = (Tickets) o;
        return id == tickets.id && ticketPrice == tickets.ticketPrice && flightTime == tickets.flightTime && Objects.equals(airportFrom, tickets.airportFrom) && Objects.equals(airportTo, tickets.airportTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ticketPrice, airportFrom, airportTo, flightTime);
    }
}
