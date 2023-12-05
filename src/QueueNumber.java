public class Application {
    private static Application instance;
    private int currentQueueNumber = 1;
    private Application() {
    }

    public static synchronized Application getInstance() {
        if (instance == null)
            instance = new Application();
        return instance;
    }

    public int getNextQueueNumber() {
        return currentQueueNumber++;
    }

    public void resetQueueNumber(int newQueueNumber) {
        if (newQueueNumber >= currentQueueNumber) {
            currentQueueNumber = newQueueNumber;
            System.out.println("Queue system reset to queue number: " + newQueueNumber);
        } else {
            System.out.println("Sorry, invalid input. Kindly provide a number greater than or equal to the current queue number.");
        }
    }

    public void serveNextCustomer(String stationName) {
        int customerQueueNumber = getNextQueueNumber();
        System.out.println(stationName + " is assisting customer with queue number: " + customerQueueNumber);
    }
}
