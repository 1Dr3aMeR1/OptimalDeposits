package org.example;

import org.example.banks.sberbank.SberbankDeposit;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        SberbankDeposit deposit = new SberbankDeposit();
        deposit.deposits();
    }
}

