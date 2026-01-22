package com.condingshuttle.projects.lovable_clone.service;

import com.condingshuttle.projects.lovable_clone.Dto.subscription.PlanLimitsResponse;
import com.condingshuttle.projects.lovable_clone.Dto.subscription.UsageTodayResponse;

public interface UsageService {


    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
