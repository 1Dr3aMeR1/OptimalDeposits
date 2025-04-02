package org.example.banks.sberbank;

import org.example.banks.Deposit;
import org.example.banks.Deposits;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class SberbankDeposit implements Deposits {
    @Override
    public Collection<Deposit> deposits() throws IOException {

        Document siteHTML = Jsoup.connect("https://www.sberbank.com/ru/person/contributions/deposits").get();
        String pathjson = null;
        System.out.println(siteHTML);


        return List.of();
    }
}

