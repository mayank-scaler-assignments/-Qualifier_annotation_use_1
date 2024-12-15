package org.example.evaluations.evaluation.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GoogleKeyVault implements IKeyVault{

    private Map<String, String> map;

    public GoogleKeyVault() {
        this.map = new HashMap<String, String>();
    }

    @Override
    public void saveSecret(String secretName, String secretValue) {
        this.map.put(secretName, secretValue);
    }

    @Override
    public String retrieveSecret(String secretName) {
        return map.get(secretName);
    }
}
