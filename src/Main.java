public class Main {
    public static void main(String[] args) {
        HelpDeskStation helpDesk1 = new HelpDeskStation("Help Desk 1");
        HelpDeskStation helpDesk2 = new HelpDeskStation("Help Desk 2");
        HelpDeskStation helpDesk3 = new HelpDeskStation("Help Desk 3");

        System.out.println("Pag-ibig Office Help Desk Stations");

        helpDesk1.serveNextCustomer();
        helpDesk2.serveNextCustomer();
        helpDesk3.serveNextCustomer();
        System.out.println();
        helpDesk1.resetQueueNumber(5);
        System.out.println();
        helpDesk1.serveNextCustomer();
        helpDesk2.serveNextCustomer();
        helpDesk3.serveNextCustomer();

    }
}