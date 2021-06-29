package com.example.refactorinterfaces.services;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DomainSearchServiceImpl implements DomainSearchService {

    @Override
    public String findById(Long id) {
        return "Str " + id;
    }

    @Override
    public List<String> findByName(String name) {
        return null;
    }


}
