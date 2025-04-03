package org.example.bank.tbank;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.bank.Bank;
import org.example.bank.Deposit;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class Tbank implements Bank {

    private final HttpClient client;
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public Tbank(HttpClient client) {
        this.client = client;
    }

    public Tbank() {
        this(HttpClient.newBuilder().build());
    }

    @Override
    public Collection<Deposit> deposits() throws Exception {
        final HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://www.tbank.ru/api/common/v1/actual_deposit_rates?appName=web&origin=web%2Cib5%2Cplatform&platform=web"))
                .GET()
                .build();

        final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        final Map<String, Object> map = objectMapper.readValue(response.body(), new TypeReference<>() {
        });

        final List<Deposit> deposits = new ArrayList<>();
        for (Map<String, Object> product : (List<Map<String, Object>>) map.get("payload")) {
            for (Map<String, Object> currencyData : (List<Map<String, Object>>) product.get("currencyData")) {
                for (Map<String, Object> subsData : (List<Map<String, Object>>) currencyData.get("subsData")) {
                    for (Map<String, Object> standardRateData : (List<Map<String, Object>>) subsData.get("standardRateData")) {
                        deposits.add(new TbankDeposit(standardRateData));
                    }
                }
            }
        }

        return deposits;
    }
}
