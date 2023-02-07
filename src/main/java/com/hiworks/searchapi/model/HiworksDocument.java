package com.hiworks.searchapi.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "keyword")
@AllArgsConstructor
public class HiworksDocument {

    @Id
    private String id;
    private String resource; // pk or endpoint

}
