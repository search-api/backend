package com.hiworks.searchapi.service;

import com.hiworks.searchapi.model.BaseDocument;
import com.hiworks.searchapi.model.MailDocument;
import com.hiworks.searchapi.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SearchService {

    private final SearchRepository searchRepository;

    public void save(final MailDocument document) {
        BaseDocument save = searchRepository.save(document);

    }

    public BaseDocument findById(final String id){
        return searchRepository.findById(id).orElse(null);
    }
}
