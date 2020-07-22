package com.finra.vanitydecoder.views;

import com.finra.vanitydecoder.engine.Operator;

import java.util.List;

public class VanityPage {
    private final String number;
    private final int page;
    private final int totalPages;
    private final int pageSize;
    private final int totalEntries;
    private final List<String> vanityList;
    public VanityPage(String number, int page, int pageSize){
        this.number = number;
        this.page = page;
        this.vanityList = Operator.getPage(number, page, pageSize);;
        this.totalPages = Operator.getTotalPages(number, pageSize);
        this.pageSize = vanityList.size();
        this.totalEntries = Operator.getAllEntries(number);
    }
    public String getNumber(){
        return number;
    }

    public int getPage(){
        return page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalEntries() {
        return totalEntries;
    }

    public List<String> getVanityList(){
        return vanityList;
    }
}
