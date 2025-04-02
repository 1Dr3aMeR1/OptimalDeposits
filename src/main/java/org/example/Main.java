package org.example;

import org.example.banks.sberbank.SberbankDeposit;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SberbankDeposit deposit = new SberbankDeposit();
        deposit.deposits();
        System.out.println();
    }
}

