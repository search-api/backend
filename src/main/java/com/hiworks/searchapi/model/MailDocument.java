package com.hiworks.searchapi.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

@Document(indexName = "mail")
@Mapping(mappingPath = "static/es-mapping.json")
public class MailDocument extends BaseDocument {
}
