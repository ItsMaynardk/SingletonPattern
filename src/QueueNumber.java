public class QueueNumber {
    private static QueueNumber instance;
    private int currentQueueNumber = 1;

    private QueueNumber() {}

    public static QueueNumber getInstance() {
        if (instance == null) {
            instance = new QueueNumber();
        }
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
            System.out.println("Invalid input. Please provide a number greater than or equal to the current queue number.");
        }
    }
}