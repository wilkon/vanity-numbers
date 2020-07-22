package com.finra.vanitydecoder.controller;

import com.finra.vanitydecoder.views.VanityPage;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VanityDecoderController {
    @GetMapping(value="/decoded-page", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<VanityPage> decodedPage(
            @RequestParam(required=true) String number,
            @RequestParam(required=false, defaultValue="0") int page,
            @RequestParam(required=true) int pageSize){
        System.out.printf("\nnumber to use %s, Requesting Page %s", number, page);
        return ResponseEntity.ok(new VanityPage(number, page, pageSize));
    }
}
