package org.example.banks.tinkoff;

import org.example.banks.Deposit;
import org.example.banks.Deposits;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TinkoffDeposit implements Deposits {
    @Override
    public Collection<Deposit> deposits() throws IOException {
         Collection<Deposit> deposits = new ArrayList<>();
         deposits.add(new Deposit() {
             @Override
             public String bank() {
                 return "";
             }

             @Override
             public String deposit() {
                 return "";
             }

             @Override
             public int dayPeriod() {
                 return 0;
             }

             @Override
             public float rate() {
                 return 0;
             }

             @Override
             public int minDeposit() {
                 return 0;
             }

             @Override
             public int maxDeposit() {
                 return 0;
             }
         });
         return deposits;
    }


}
