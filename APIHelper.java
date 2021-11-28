import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * 
 * Keeps track of all API requests
 * 
 */
public class APIHelper {

    /**
     * 
     * Creates a URL for the correct page then maps the string to a List of Ticket objects
     * 
     * Enter your subdomain for zendesk, remove brackets
     * 
     * @param pageNum what page of tickets to grab. Page 1, 2, etc.
     * @return an array of Ticket Objects, 100 of them
     * @throws Exception if the server is down or if ObjectMapper is not working
     */
    public TicketList getAllTicketsRequest(int pageNum) throws Exception {
        String response = "";
        TicketList ticketArray = new TicketList();
        String urlFin = "tickets.json?page=" + Integer.toString(pageNum);
        URL base = new URL("https://{subdomain}.zendesk.com/api/v2/");
        URL url = new URL(base, urlFin);

        String test = makeRequest(url);
        response += test;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ticketArray = mapper.readValue(response, TicketList.class);

        return ticketArray;
    }


    /**
     * 
     * Performs a GET request depending on what URL is sent in
     * 
     * Enter your username and password in the fields. Remove brackets
     * 
     * @param url a url to be used for a GET request.
     * @return a string to be converted into an object
     * @throws Exception if the server is down
     */
    public String makeRequest(URL url) throws Exception {
        String user = "{username}";
        String password = "{password}";
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        String auth = user + ":" + password;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
        String authHeaderValue = "Basic " + new String(encodedAuth);
        http.setRequestProperty("Authorization", authHeaderValue);

        BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
     	    response.append(inputLine);
        }
        http.disconnect();
        return response.toString();
    }


    /**
     * 
     * Creates a URL for a specific ticket then maps it to a Ticket Object
     * 
     * @param id the id of the ticket
     * @return the ticket
     * @throws Exception if server is down or ObjectMapper is not working
     */
    public Tickets getSpecTicket(String id) throws Exception {
        URL base = new URL("https://zccbenkelleyticketviewer.zendesk.com/api/v2/tickets/");
        String idStr = id + ".json";
        URL url = new URL(base, idStr);
        String response = makeRequest(url);

        ObjectMapper map = new ObjectMapper();
        map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Tickets ts = new Tickets();
        TicketObj rt2 = map.readValue(response, TicketObj.class);
        ts = rt2.getTicket();

        return ts;
    }


    /**
     * 
     * Gets the count of how many tickets a user has
     * 
     * @return how many tickets a user has
     * @throws Exception if server is down or Object Mapper does not work
     */
    public int getCount() throws Exception{
        int ct = 0;
        URL url = new URL("https://zccbenkelleyticketviewer.zendesk.com/api/v2/tickets/count.json");
        String response = makeRequest(url);

        ObjectMapper map = new ObjectMapper();
        map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        CountRoot count = map.readValue(response, CountRoot.class);
        ct = count.getCount().getValue();

        return ct;
    }
}
