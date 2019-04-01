package ejerciciotickettransito.gentickets;

import ejerciciotickettransito.ConversoraJSON;
import ejerciciotickettransito.Ticket;

public class GeneradorTicketTxt implements GeneradorTicket {
    private ConversoraJSON conversoraJSON;
    private String pathTickets;

    public GeneradorTicketTxt(ConversoraJSON conversoraJSON, String pathTickets) {
        this.conversoraJSON = conversoraJSON;
        this.pathTickets = pathTickets;
    }
    public void generar(Ticket t) {
        
    }
}
