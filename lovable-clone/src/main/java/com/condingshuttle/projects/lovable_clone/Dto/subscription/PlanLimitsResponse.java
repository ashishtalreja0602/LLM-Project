package com.condingshuttle.projects.lovable_clone.Dto.subscription;

public record PlanLimitsResponse(

        String PlanName,
        Integer maxtokensPerDay,
        Integer maxProjects,
        Boolean unlimitedAi

) {
}
