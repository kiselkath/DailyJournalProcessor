package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JournalProcessorTest {
    private  JournalEntry entry;
    private JournalProcessor processor;

    @BeforeEach
    void setUp(){
        entry = new JournalEntry("First Content");
        processor = new JournalProcessor();

    }

    @Test
    void testAppendTimestamp(){
        entry.setContent("My day was great");
        processor.appendTimestamp(entry);
        assertTrue(entry.getContent().contains("My day was great"));
        assertEquals(2,entry.getEditCount());

    }

    @Test
    void testReverseContent(){
        entry.setContent("abc");
        processor.reverseContent(entry);
        assertEquals("cba", entry.getContent());
        assertEquals(2,entry.getEditCount());

    }

    @Test
    void testConvertToUpperCase(){
        entry.setContent("abc");
        processor.convertToUpperCase(entry);
        assertEquals("ABC", entry.getContent());
        assertEquals(2,entry.getEditCount());
    }

}