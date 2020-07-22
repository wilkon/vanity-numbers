package com.finra.vanitydecoder.models;

import java.util.HashMap;

public class Phone {
    public final HashMap<Character, String> keys;
    public Phone(){
        keys = new HashMap<Character, String>();
        init();
    }
    private void init(){
        keys.put('0', " ");
        keys.put('1', "1");
        keys.put('2', "abc");
        keys.put('3', "def");
        keys.put('4', "ghi");
        keys.put('5', "jkl");
        keys.put('6', "mno");
        keys.put('7', "pqrs");
        keys.put('8', "tuv");
        keys.put('9', "wxyz");
        keys.put('*', "*");
        keys.put('#', "#");
    }

}
