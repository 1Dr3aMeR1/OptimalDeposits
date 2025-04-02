package org.example.banks;

import java.io.IOException;
import java.util.Collection;

public interface Deposits {
    Collection<Deposit> deposits() throws IOException;
}
