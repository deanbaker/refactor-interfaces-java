package com.example.refactorinterfaces.services;

import java.util.List;

public interface DomainSearchService {

    String findById(Long id);

    List<String> findByName(String name);
}
