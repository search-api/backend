package com.hiworks.searchapi.controller;

import com.hiworks.searchapi.model.HiworksDocument;
import com.hiworks.searchapi.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @PostMapping
    public void save(@RequestBody final HiworksDocument document) {
        searchService.save(document);
    }

    @GetMapping("/{id}")
    public HiworksDocument findById(@PathVariable final String id){
        return searchService.findById(id);
    }

}
