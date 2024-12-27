package com.edu;

import java.math.BigDecimal;

public class Payment implements Paymentable {
    private String paymentId;
    private BigDecimal amount;
    private boolean isPaid;

    @Override
    public void processPayment() {
        // Logic to process payment
    }

    public boolean checkPaymentStatus() {
        return isPaid;
    }

}
