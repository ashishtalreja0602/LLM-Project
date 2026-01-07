package com.condingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;



@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {

    Long id;
    String name;
    User owner;
    Boolean isPublic = false;

    Instant createdAt;
    Instant deletedAt;
    Instant updatedAt;


}
