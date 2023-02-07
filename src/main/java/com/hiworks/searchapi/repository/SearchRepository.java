package com.hiworks.searchapi.repository;

import com.hiworks.searchapi.model.HiworksDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SearchRepository extends ElasticsearchRepository<HiworksDocument, String> {
}
