package org.example;

import org.example.bank.tbank.Tbank;

public class Main {
    public static void main(String[] args) throws Exception {
        new Tbank().deposits().forEach(System.out::println);
    }
}