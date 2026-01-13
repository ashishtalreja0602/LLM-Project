package com.condingshuttle.projects.lovable_clone.Dto.member;

import com.condingshuttle.projects.lovable_clone.entity.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
