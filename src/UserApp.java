public class UserApp {
    public static void main(String[] args) {
        Application app = Application.getInstance();

        System.out.println("The Pag-ibig office help desk stations:");

        app.serveNextCustomer("Help Desk 1");
        app.serveNextCustomer("Help Desk 2");
        app.serveNextCustomer("Help Desk 3");

        System.out.println();
        app.resetQueueNumber(5);

        app.serveNextCustomer("Help Desk 1");
        app.serveNextCustomer("Help Desk 2");
        app.serveNextCustomer("Help Desk 3");
    }
}
