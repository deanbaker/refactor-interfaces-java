package com.example.refactorinterfaces.services;

public interface DomainUpdateService {

    String create(String str);

    String update(Long id, String str);
}
