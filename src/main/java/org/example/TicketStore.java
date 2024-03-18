package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketStore {

    Map<String, EntryTicket> tickets;

    public TicketStore(){
        this.tickets = new HashMap<>();
    }

    public void addTicket(EntryTicket ticket){
        tickets.put(ticket.getId(), ticket);
    }

    public EntryTicket getTicket(String ticketId){
        return tickets.get(ticketId);
    }

}
