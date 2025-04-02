package org.example.bank.tbank;

import org.example.bank.Deposit;

import java.util.Map;

final class TbankDeposit implements Deposit {

    private final Map<String, Object> data;

    TbankDeposit(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public double rate() {
        return (double) data.get("rate");
    }

    @Override
    public int begPeriod() {
        return (int) data.get("begPeriod");
    }

    @Override
    public int endPeriod() {
        return (int) data.get("endPeriod");
    }

    @Override
    public String toString() {
        return "rate: " + rate() + ", begPeriod: " + begPeriod() + ", endPeriod: " + endPeriod();
    }
}
