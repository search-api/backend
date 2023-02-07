package com.hiworks.searchapi.service;

import com.hiworks.searchapi.model.HiworksDocument;
import com.hiworks.searchapi.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SearchService {

    private final SearchRepository searchRepository;

    public void insert() {
        HiworksDocument hiworksDocument = new HiworksDocument("1", "resource...");
        searchRepository.save(hiworksDocument);

    }

    public List<HiworksDocument> findAll() {
        List<HiworksDocument> result = (List<HiworksDocument>) searchRepository.findAll();
        return result;
    }
}
