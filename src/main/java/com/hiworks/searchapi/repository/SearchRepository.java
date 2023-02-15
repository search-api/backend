package com.hiworks.searchapi.repository;

import com.hiworks.searchapi.model.MailDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SearchRepository extends ElasticsearchRepository<MailDocument, String> {
}
