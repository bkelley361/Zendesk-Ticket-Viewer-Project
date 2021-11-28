import java.util.Scanner;

public class TicketViewer {

    /**
     * 
     * mainLoop is the loop for the program. This is what the main method will call that will run the program.
     * 
     * *numTickets is the number of tickets that are in your account
     * 
     * *newPage keeps track of which segment of 4 the pages are on. Only 25 tickets per page and only 100 tickets in the
     * TicketList. When the pages goes above 4 then newPage needs to restart at 1 to keep track of the new list of 100.
     * 
     * *lgPage keeps track of how many times a new TicketList will need to be made.
     * 
     * *curPage keeps track overall of what page the user is on. It is the one that is displayed with the program.
     * 
     */
    public void mainLoop() { 
        Scanner sc = new Scanner(System.in); 
        int numTickets = 0;
        int newPage = 1;
        int lgPage = 1;
        int curPage = 1;
        TicketList rt = new TicketList();
        APIHelper helper = new APIHelper();
        try {
            numTickets = helper.getCount();
            rt = helper.getAllTicketsRequest(1);
        } 
        catch (Exception e) {
            System.out.println("It seems that the page is unavailable. Please try again later");
        }
        while (true) {
            if (newPage > 4) {
                newPage = 1;
            }
            if (curPage * 25 > lgPage * 100) {
                lgPage += 1;
                try {
                    numTickets = helper.getCount();
                    rt = helper.getAllTicketsRequest(lgPage);
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            } 
            else if (curPage * 25 == lgPage * 100) {
                newPage = 4;
                try {
                    numTickets = helper.getCount();
                    rt = helper.getAllTicketsRequest(lgPage);
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            pageNum(rt, curPage, newPage);
            System.out.println("Hello and welcome to the Zendesk Ticket Viewer");
            System.out.println("You have " + numTickets + " tickets");
            System.out.println("To continue type:");
            System.out.println("1 to view next page of tickets");
            System.out.println("2 to view previous page of tickets");
            System.out.println("3 to view a certain ticket");
            System.out.println("4 to quit");
            System.out.println();

            String input = sc.nextLine();

            if (input.equals("1")) {
                if (curPage == (numTickets / 25) + 1) {
                    System.out.println("You have reached the last page");
                }
                else {
                    curPage += 1;
                    newPage += 1;
                }
            }
            else if (input.equals("2")) {
                if (curPage == 1) {
                    System.out.println("There is no previous page");
                }
                else {
                    if ((curPage * 25) - 1 < lgPage * 100 && lgPage != 1) {
                        newPage = 1;
                        lgPage -= 1;
                    }
                    else {
                        newPage -= 1;
                    }      
                    curPage -= 1;              
                }
            }
            else if (input.equals("3")) {
                System.out.println();
                System.out.println("Please enter the id of your ticket");
                String id = sc.nextLine();
                Tickets ts = new Tickets();
                try {
                    ts = helper.getSpecTicket(id);
                    System.out.println(ts.getId());
                }
                catch (Exception e) {
                    System.out.println("It seems that the page is unavailable. Please try again later");
                }
                System.out.println();
                System.out.println("Ticket Id: " + ts.getId());
                System.out.println("Ticket Created at: " + ts.getCreated_at());
                System.out.println("Ticket Status: " + ts.getStatus());
                System.out.println("Ticket Subject: " + ts.getSubject());
                System.out.println("Ticket URL: " + ts.getUrl());
                System.out.println("Ticket Description: " + ts.getDescription());
                System.out.println();
            }
            else if (input.equals("4")) {
                System.out.println("Goodbye, I hope you enjoyed");
                sc.close();
                return;
            }
            else {
                System.out.println("Could you try that again?");
            }
        }
    }

    /**
     * 
     * pageNum prints 25 tickets and some information about them based on what page the user is on
     * 
     * @param rt is the TicketList that is sent in
     * @param page is the current page that the user is on
     * @param newPage is what segment of 4 the user is on
     * 
     */

    public void pageNum(TicketList rt, int page, int newPage) {
        System.out.println();
        System.out.println("Page " + page);
        System.out.println();
        System.out.print(String.format("|%-10s|  |%-30s|  |%-30s|  |%-40s", "Id", "Created", "Status", "Subject"));
        System.out.println();
        System.out.println();
        for (int i = (newPage * 25) - 25; i < newPage * 25; i++) {
            if (rt.getLength() - 1 < i) {
                System.out.println("No more tickets");
                break;
            }
            else {
                System.out.println(String.format("|%-10s|  |%-30tc|  |%-30s|  |%-40s", rt.getTickets(i).getId(), rt.getTickets(i).getCreated_at(), rt.getTickets(i).getStatus(),rt.getTickets(i).getSubject()));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TicketViewer test = new TicketViewer();
        test.mainLoop();
    }
}