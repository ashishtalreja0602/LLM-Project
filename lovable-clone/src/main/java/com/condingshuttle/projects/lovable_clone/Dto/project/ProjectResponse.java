package com.condingshuttle.projects.lovable_clone.Dto.project;

import com.condingshuttle.projects.lovable_clone.Dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(

        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,

        UserProfileResponse  owner
) {
}
