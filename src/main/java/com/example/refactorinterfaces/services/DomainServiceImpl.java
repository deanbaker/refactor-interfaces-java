package com.example.refactorinterfaces.services;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DomainServiceImpl has grown organically, and you will find links from this
 * component to many others, crossing domains it probably has no business crossing.
 *
 */
@Service
public class DomainServiceImpl implements DomainService{

    @Override
    public String findById(Long id) {
        return "Str " + id;
    }

    @Override
    public List<String> findByName(String name) {
        return null;
    }

    @Override
    public String create(String str) {
        return null;
    }

    @Override
    public String update(Long id, String str) {
        return null;
    }

}
