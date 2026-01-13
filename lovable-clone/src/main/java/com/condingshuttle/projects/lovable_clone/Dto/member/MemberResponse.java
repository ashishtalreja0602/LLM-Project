package com.condingshuttle.projects.lovable_clone.Dto.member;

import com.condingshuttle.projects.lovable_clone.entity.ProjectRole;

import java.time.Instant;

public record MemberResponse(

        Long id,
        String email,
        String name,
        String avatarUrl,

        ProjectRole role,
        Instant invitedAt



) {




}
