package com.condingshuttle.projects.lovable_clone.Dto.subscription;

import com.condingshuttle.projects.lovable_clone.entity.Plan;

import java.time.Instant;

public record SubscriptionResponse(

        Plan plan,
        String status,
        Instant periodEnd,
        Long tokenUsedThisCycle
) {
}
