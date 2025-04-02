package org.example.banks;

public interface Deposit {
    String bank();
    String deposit();
    int dayPeriod();
    float rate();
    int minDeposit();
    int maxDeposit();
}
