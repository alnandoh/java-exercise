package com.adepuu.exercises.session7;

import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Event event;
    private String name;

    private static int sales=0;

    public Ticket(UUID ticketID, Event event, String name) {
        if (event.getCapacity() > 0) {
            this.ticketID = ticketID;
            this.event = event;
            this.name = name;
            sales++;
            event.setCapacity(event.getCapacity() - 1);
        }

    }

    public static int getSales() {
        return sales;
    }

    public static void setSales(int sales) {
        Ticket.sales = sales;
    }

    public UUID getTicketId() {
        return ticketID;
    }

    public void setTicketID(UUID id) {
        this.ticketID = ticketID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "ID: " + this.getTicketId().toString() + "\nEvent: " + this.getEvent() + "\nName: " + this.getName();
    }
}