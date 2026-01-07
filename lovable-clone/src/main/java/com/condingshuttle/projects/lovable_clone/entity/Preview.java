package com.condingshuttle.projects.lovable_clone.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    Long id;
    Project project;
    String nameSpace; // Isolation of resources on kubernetes (things are on their own namespace)
    String podName;   // smallest unit in the kubernetes
    String previewUrl; // application will discoverable inside the POD

    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;

    PreviewStatus status;

}
