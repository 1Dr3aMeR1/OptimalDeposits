package org.example.bank.sberbank;

import org.example.bank.Deposit;
import org.example.bank.Bank;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class SberbankDeposit implements Bank {
    @Override
    public Collection<Deposit> deposits() throws IOException {

        Document siteHTML = Jsoup.connect("https://www.sberbank.com/ru/person/contributions/deposits").get();
        String pathjson = null;
        System.out.println(siteHTML);


        return List.of();
    }
}

