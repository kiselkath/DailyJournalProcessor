package org.example;

/**
 * Represents a journal entry with content and edit tracking.
 */
public class JournalEntry {
    // Fields
    private  String content; //  Stores the text body of the journal.
    private int editCount; //  Tracks how many times the content has been modified using the setter method.

    // Constructor
    // Best Practice Tip: Initialize all fields in constructors for predictability.
    public JournalEntry(String content) {
        this.content = content;
        this.editCount = 0;
    }

    // Accessor Methods (Getters): ReadOnly _
    public String getContent() {
        return content;
    }

    public int getEditCount() {
        return editCount;
    }

    // Mutator Method (Setter)
    public void setContent(String content) {
        this.content = content; // replace the old content with the new one
        this.editCount++; // Increments the edit counter, tracking how many times it’s been modified.
    }




}