package com.finra.vanitydecoder.engine;

import com.finra.vanitydecoder.models.Phone;
import com.finra.vanitydecoder.models.PhoneBook;

public class Decoder {

    private Phone phone = new Phone();

    public void generate (String digits, PhoneBook book){
        if(digits.length() == 0) return;
        if(digits.length() != 7 && digits.length() != 10) return;

        generate(digits, book, new StringBuilder());
    }

    private void generate (String digits, PhoneBook book, StringBuilder acc){
        if(acc.length() == digits.length()){
            book.addEntry(acc.toString());
            return;
        }

        String letters = phone.keys.get(digits.charAt(acc.length()));
        for(int i=0; i<letters.length(); i++){
            acc.append(letters.charAt(i));
            generate(digits, book, acc);
            acc.deleteCharAt(acc.length()-1);
        }
    }

}
