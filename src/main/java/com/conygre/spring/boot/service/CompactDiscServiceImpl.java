package com.conygre.spring.boot.service;


import com.conygre.spring.boot.entities.CompactDisc;
import com.conygre.spring.boot.repos.CompactDiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
@Service
@Transactional (propagation = Propagation.REQUIRED)
public class CompactDiscServiceImpl implements CompactDiscService{


    @Override
    public Iterable<CompactDisc> getCatalog() {
        return null;
    }
}
