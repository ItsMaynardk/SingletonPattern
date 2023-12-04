public class HelpDeskStation {
    private String stationName;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public void serveNextCustomer() {
        QueueNumber queueSystem = QueueNumber.getInstance();
        int customerQueueNumber = queueSystem.getNextQueueNumber();
        System.out.println(stationName + " is assisting customer with queue number: " + customerQueueNumber);
    }

    public void resetQueueNumber(int newQueueNumber) {
        QueueNumber.getInstance().resetQueueNumber(newQueueNumber);
    }
}