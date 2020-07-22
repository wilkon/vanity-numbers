package com.finra.vanitydecoder.engine;

import com.finra.vanitydecoder.models.PhoneBook;

import java.util.HashMap;
import java.util.List;

public class Operator {
    private static HashMap<String, PhoneBook> cache = new HashMap<>();;
    private static final Decoder decoder = new Decoder();

    public static List<String> getPage(String number, int page, int pageSize){
        if(page < 0) return null;
        PhoneBook book = getOrCreate(number);
        return book.getPage(page, pageSize);
    }

    public static int getTotalPages(String number, int pageSize){
        PhoneBook book = getOrCreate(number);
        return book.getPageCount(pageSize);
    }

    public static int getAllEntries(String number){
        PhoneBook book = getOrCreate(number);
        return book.getEntriesCount();
    }

    private static PhoneBook getOrCreate(String number){
        PhoneBook phoneBook;
        if(!cache.containsKey(number)){
            phoneBook = new PhoneBook();

            decoder.generate(number, phoneBook);
            cache.put(number, phoneBook);
        }else phoneBook = cache.get(number);
        return phoneBook;
    }
}
