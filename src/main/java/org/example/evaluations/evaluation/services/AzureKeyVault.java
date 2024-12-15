package org.example.evaluations.evaluation.services;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.TreeMap;

@Service
public class AzureKeyVault implements IKeyVault {

    private Map<String, String> map;

    public AzureKeyVault() {
        this.map = new TreeMap<>();
    }

    @Override
    public void saveSecret(String secretName, String secretValue) {
        map.put(secretName, secretValue);
    }

    @Override
    public String retrieveSecret(String secretName) {
        return map.get(secretName);
    }
}
