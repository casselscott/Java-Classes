public class Stringify {
    // Instance variable
    private String message;

    // Constructor
    public Stringify(String initialMessage) {
        this.message = initialMessage;
    }

    // Method to set the message
    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    // Method to get the message
    public String getMessage() {
        return this.message;
    }

    // Method to append a string to the existing message
    public void appendToMessage(String additionalMessage) {
        this.message += additionalMessage;
    }

    // Method to get the length of the message
    public int getMessageLength() {
        return this.message.length();
    }

    public static void main(String[] args) {
        // Creating an instance of StringExample
        Stringify example = new Stringify("Hello");

        // Displaying the initial message
        System.out.println("Initial Message: " + example.getMessage()); // Output: Initial Message: Hello

        // Setting a new message
        example.setMessage("Hello, World!");

        // Displaying the updated message
        System.out.println("Updated Message: " + example.getMessage()); // Output: Updated Message: Hello, World!

        // Appending a string to the message
        example.appendToMessage(" How are you?");
        System.out.println("Appended Message: " + example.getMessage()); // Output: Appended Message: Hello, World! How are you?

        // Getting the length of the message
        System.out.println("Message Length: " + example.getMessageLength()); // Output: Message Length: 28
    }
}
