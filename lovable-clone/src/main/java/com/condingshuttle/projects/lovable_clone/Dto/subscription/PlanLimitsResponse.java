package com.condingshuttle.projects.lovable_clone.Dto.subscription;

public record PlanLimitsResponse(

        String PlanName,
        int maxtokensPerDay,
        int maxProjects,
        boolean unlimitedAi

) {
}
