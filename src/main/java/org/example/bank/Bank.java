package org.example.bank;

import java.net.URISyntaxException;
import java.util.Collection;

public interface Bank {
    Collection<Deposit> deposits() throws Exception;
}
