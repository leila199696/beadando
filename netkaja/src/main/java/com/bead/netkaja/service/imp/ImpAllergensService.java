package com.bead.netkaja.service.imp;

import com.bead.netkaja.repository.AllergensRepository;
import com.bead.netkaja.service.interf.AllergensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpAllergensService implements AllergensService {
    @Autowired
    private AllergensRepository allergensRepository;
}
