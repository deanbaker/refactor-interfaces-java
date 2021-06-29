package com.example.refactorinterfaces.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomainController {

    private final DomainService domainService;

    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @GetMapping(value = "domains/{id}")
    public String findById(@PathVariable Long id) {

        return domainService.findById(id);
    }
}
