package com.hiworks.searchapi.service;

import com.hiworks.searchapi.model.HiworksDocument;
import com.hiworks.searchapi.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SearchService {

    private final SearchRepository searchRepository;

    public void save(final HiworksDocument document) {
        HiworksDocument save = searchRepository.save(document);

        System.out.println(save);

    }

    public HiworksDocument findById(final String id){
        HiworksDocument hiworksDocument = searchRepository.findById(id).orElse(null);
        return hiworksDocument;
    }
}
