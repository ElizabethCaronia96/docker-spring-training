package com.conygre.spring.boot.repos;

import com.conygre.spring.boot.entities.CompactDisc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CompactDiscRepository extends CrudRepository<CompactDisc, Integer> {
    public Iterable<CompactDisc> findByArtist(String artist);
}
