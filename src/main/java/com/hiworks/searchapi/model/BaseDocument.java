package com.hiworks.searchapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.time.LocalDateTime;

@Setting(settingPath = "static/es-settings.json")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseDocument {

    @Id
    @Field(type = FieldType.Integer)
    private String id;

    @Field(type = FieldType.Integer)
    private int officeNo;

    @Field(type = FieldType.Text)
    private String content;

    @Field(type = FieldType.Date)
    private LocalDateTime createdAt;
}
