package com.condingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;
    Project project;
     User user;
     ProjectRole projectRole;
     Instant invitedAt;
     Instant acceptedAt;
}
