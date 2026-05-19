package com.pos.service;



import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.pos.domain.PaymentMethod;
import com.pos.exception.UserException;
import com.pos.modal.PaymentOrder;
import com.pos.modal.User;
import com.pos.payload.response.PaymentLinkResponse;


public interface PaymentService {

    PaymentLinkResponse createOrder(User user,
                                    Long planId,
                                    PaymentMethod paymentMethod
    ) throws RazorpayException, UserException, StripeException;

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    PaymentOrder getPaymentOrderByPaymentId(String paymentId) throws Exception;

    Boolean ProceedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId,
                                 String paymentLinkId) throws RazorpayException;

    PaymentLink createRazorpayPaymentLink(User user,
                                          Double Amount,
                                          Long orderId) throws RazorpayException;

    String createStripePaymentLink(User user,
                                   Double Amount,
                                   Long planId) throws StripeException;
}
