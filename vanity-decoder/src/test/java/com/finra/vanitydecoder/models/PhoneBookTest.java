package com.finra.vanitydecoder.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {

    @Test
    public void validEntries(){
        PhoneBook book = new PhoneBook();
        book.addEntry("1234567");
        assertTrue(book.getEntriesCount() == 1);
        book.addEntry("1234567890");
        assertTrue(book.getEntriesCount() == 2);
    }
}
