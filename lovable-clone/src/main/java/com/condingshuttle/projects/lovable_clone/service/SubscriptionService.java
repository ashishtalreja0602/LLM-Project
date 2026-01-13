package com.condingshuttle.projects.lovable_clone.service;

import com.condingshuttle.projects.lovable_clone.Dto.subscription.CheckOutRequest;
import com.condingshuttle.projects.lovable_clone.Dto.subscription.CheckOutResponse;
import com.condingshuttle.projects.lovable_clone.Dto.subscription.PortalResponse;
import com.condingshuttle.projects.lovable_clone.Dto.subscription.SubscriptionResponse;

public interface SubscriptionService {

    SubscriptionResponse getCurrentSuscription(Long userId);

    CheckOutResponse createCheckOutSessionUrl(CheckOutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
