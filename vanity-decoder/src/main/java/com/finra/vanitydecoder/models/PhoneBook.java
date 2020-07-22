package com.finra.vanitydecoder.models;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final ArrayList<String> book;

    public PhoneBook(){
        book = new ArrayList();
    }

    public List<String> getPage(int page, int pageSize){
        if(page * pageSize > book.size()) return null;

        int start = pageSize * page;
        int end = start + pageSize <  book.size() ? start + pageSize :  book.size();
        return book.subList(start, end);
    }

    public void addEntry(String number){
        book.add(number);
    }

    public int getEntriesCount(){
        return book.size();
    }

    public int getPageCount(int pageSize){
        int pages = book.size()/pageSize;
        int rem = book.size() % pageSize > 0 ? 1 : 0;
        return pages + rem;
    }
}
