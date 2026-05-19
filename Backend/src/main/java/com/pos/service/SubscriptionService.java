package com.pos.service;

import com.pos.domain.PaymentStatus;
import com.pos.domain.SubscriptionStatus;
import com.pos.modal.Store;
import com.pos.modal.Subscription;
import com.pos.modal.SubscriptionPlan;

import java.util.List;
import java.util.Optional;

public interface SubscriptionService {

    // 🆕 Create a new subscription for a store
    Subscription createSubscription(Long storeId,
                                    Long planId,
                                    String gateway,
                                    String transactionId
    );

    // 🔄 Upgrade the current active subscription
    Subscription upgradeSubscription(Long storeId,
                                     Long planId,
                                     String gateway, String transactionId);

    // ✅ Activate subscription (after payment success)
    Subscription activateSubscription(Long subscriptionId);

    // 🚫 Cancel a subscription manually
    Subscription cancelSubscription(Long subscriptionId);

    // ⏳ Expire subscriptions that passed end date
    void expirePastSubscriptions();

    // 🧾 Update payment status (after webhook or manual)
    Subscription updatePaymentStatus(Long subscriptionId, PaymentStatus status);

    // 📋 🔍 Get all or filtered subscriptions of a store (if status provided)
    List<Subscription> getSubscriptionsByStore(Long storeId, SubscriptionStatus status); // combine active + history

    // 📦 📍 Get all or filtered subscriptions (for admin)
    List<Subscription> getAllSubscriptions(SubscriptionStatus status); // null status = all

    // 📅 Get subscriptions expiring in next X days
    List<Subscription> getExpiringSubscriptionsWithin(int days);

    // 📈 Count subscriptions by status
    Long countByStatus(SubscriptionStatus status);
}
