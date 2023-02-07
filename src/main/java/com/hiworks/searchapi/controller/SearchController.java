package com.hiworks.searchapi.controller;

import com.hiworks.searchapi.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @GetMapping
    public ResponseEntity<Object> find() {
        searchService.insert();
        return ResponseEntity.ok(searchService.findAll());
    }

}
