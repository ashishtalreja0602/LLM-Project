package com.condingshuttle.projects.lovable_clone.entity;

import com.condingshuttle.projects.lovable_clone.SubscriptionStatus;

import java.time.Instant;

public class Subscription {

    Long id;
    User user;
    Plan plan;

    String stripeCustomerId;
    String stripeSubscriptionId;

    Instant currentPeriodStart;
    Instant getCurrentPeriodEnd;
    Boolean cancelAtPeriodEnd;
    Boolean currentAtPeriodEnd = false;

    Instant createdAt;
    Instant updatedAt;

    SubscriptionStatus status;



}
