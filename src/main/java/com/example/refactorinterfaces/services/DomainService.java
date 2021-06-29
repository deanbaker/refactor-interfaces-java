package com.example.refactorinterfaces.services;

import java.util.List;

/**
 * The DomainService has been with us for a long time.
 * It has evolved over the years to be a bit of a dumping ground for
 * all operations that may (or may not) relate to a domain.
 */
public interface DomainService extends DomainUpdateService {


      // Something like the below can muddy the waters. We'll omit this for
      // the purposes of this exercise.
//    List<String> findByObscureDomainId(Long otherId);
}
