package org.example;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Processes journal entries using StringBuilder and StringBuffer.
 */
public class JournalProcessor {

    /**
     * Appends a timestamp to the journal entry content.
     * Uses StringBuilder for single-threaded efficiency.
     * StringBuilder is not thread-safe
     *
     * @param entry JournalEntry object
     * */
    public void appendTimestamp(JournalEntry entry){
        StringBuilder sb = new StringBuilder(entry.getContent());
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        /**
         * LocalDateTime.now(): Fetches the current system date and time (without time zone). e.g. 2025-05-13T14:50:23.456
         * .format(...) : Formats the LocalDateTime into a String using the given formatter.
         * DateTimeFormatter.ISO_DATE_TIME : yyyy-MM-dd'T'HH:mm:ss.SSS , A built-in formatter that outputs in ISO-8601 format.
         * */
        sb.append(" [").append(timestamp).append("]");
        entry.setContent(sb.toString());

    }

    /**
     * Reverses the journal entry content.
     * Uses StringBuffer for thread-safe operations.
     * StringBuffer is just like StringBuilder, but it's synchronized, meaning it's thread-safe.
     * @param  entry JournalEntry object
     *
     * */
    public void reverseContent(JournalEntry entry){
        StringBuffer sb = new StringBuffer(entry.getContent());
        sb.reverse();
        entry.setContent(sb.toString());
    }



    /**
     * Converts the journal entry content to uppercase.
     * Uses StringBuilder for efficient single-threaded operation.
     *
     * @param entry JournalEntry object
     */
    public void convertToUpperCase(JournalEntry entry) {

        /**
         * Technical Analysis:
         * Converts to uppercase using String::toUpperCase() which creates a new String internally.
         * Then wraps that in a StringBuilder, although not strictly necessary here.
         *
         * ⚠️ StringBuilder is not gaining much here, since you're not mutating — just wrapping.
         *
         * Suggestion: Would be simpler and equally performant.
         * entry.setContent(entry.getContent().toUpperCase());
         * */
        StringBuilder sb = new StringBuilder(entry.getContent().toUpperCase());
        entry.setContent(sb.toString());
    }

}