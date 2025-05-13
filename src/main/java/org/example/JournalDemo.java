package org.example;


/**
 * 🧪 Demo class to show usage of JournalProcessor
 */
public class JournalDemo {
    public static void main(String[] args) {
        JournalEntry entry = new JournalEntry("It was a productive day.");
        JournalProcessor processor = new JournalProcessor();

        System.out.println("Original Entry: " + entry.getContent());

        // Append timestamp
        processor.appendTimestamp(entry);
        System.out.println("After Timestamp: " + entry.getContent());

        // Convert to uppercase
        processor.convertToUpperCase(entry);
        System.out.println("After Uppercase: " + entry.getContent());


        // Reverse the content
        processor.reverseContent(entry);
        System.out.println("After Reversal: " + entry.getContent());



        // Show total edits
        System.out.println("Total Edits: " + entry.getEditCount());

    }

}