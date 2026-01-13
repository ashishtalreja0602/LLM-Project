package com.condingshuttle.projects.lovable_clone.Dto.subscription;

public record PlanResponse(

        Long id,
        String name,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Integer maxPreviews,
        Boolean unlimitedAI,
        Boolean active

) {
}
