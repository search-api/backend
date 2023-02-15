package com.hiworks.searchapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = "test2")
@Setting(settingPath = "static/es-settings.json")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HiworksDocument {

    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String resource; // pk or endpoint

}
