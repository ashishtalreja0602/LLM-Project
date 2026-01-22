package com.condingshuttle.projects.lovable_clone.controller;


import com.condingshuttle.projects.lovable_clone.Dto.subscription.*;
import com.condingshuttle.projects.lovable_clone.entity.Plan;
import com.condingshuttle.projects.lovable_clone.service.PlanService;
import com.condingshuttle.projects.lovable_clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.zip.CheckedOutputStream;

@RestController
@RequiredArgsConstructor
public class BillingController {

    private final PlanService planService;
    private final SubscriptionService subscriptionService;

    @GetMapping("/api/plans")
    public ResponseEntity<PlanResponse> getAllPlans(){
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription(){
            Long userId = 1L;
            return ResponseEntity.ok(subscriptionService.getCurrentSuscription(userId));
    }

    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<CheckOutResponse> createCheckOutResponse(
            @RequestBody CheckOutRequest request
            ){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.createCheckOutSessionUrl(request,userId));
    }

    @PostMapping("api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustormerPortal(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }


}
