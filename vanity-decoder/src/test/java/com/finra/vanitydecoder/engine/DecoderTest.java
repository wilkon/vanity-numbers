package com.finra.vanitydecoder.engine;

import com.finra.vanitydecoder.models.PhoneBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecoderTest {

    Decoder decoder = new Decoder();
    PhoneBook book = new PhoneBook();

    @Test
    public void generatesNothingWith0(){
        decoder.generate("", book);
        assertTrue(book.getEntriesCount()==0);
    }

    @Test
    public void generatesNothingWhenNotValid(){
        decoder.generate("1", book);
        assertTrue(book.getEntriesCount()==0);
    }

    @Test
    public void generatesProperly(){
        decoder.generate("1234567", book);
        assertTrue(book.getEntriesCount() > 0);

        book = new PhoneBook();
        decoder.generate("1234567891", book);
        assertTrue(book.getEntriesCount() > 0);
    }
}
