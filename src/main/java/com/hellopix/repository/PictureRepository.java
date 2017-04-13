package com.hellopix.repository;

import com.hellopix.model.Picture;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends GraphRepository<Picture> {
}
