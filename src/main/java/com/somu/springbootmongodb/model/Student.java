package com.somu.springbootmongodb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @MongoId
    private Integer id;
    private String name;
    private String city;
    private String college;


}
