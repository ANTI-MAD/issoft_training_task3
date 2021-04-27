package entity;

import java.time.LocalDate;

public class Passenger extends User{
    private TicketStatus ticketStatus;
    private Integer ticketNumber;

    public Passenger(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
        this.ticketStatus = TicketStatus.NOT_HAS;
        this.ticketNumber = null;
    }

    public Passenger(String firstName, String lastName, LocalDate birthday, TicketStatus ticketStatus, Integer ticketNumber) {
        super(firstName, lastName, birthday);
        this.ticketStatus = ticketStatus;
        this.ticketNumber = ticketNumber;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public boolean hasTicket() {
        return ticketStatus.equals(TicketStatus.HAS);
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
