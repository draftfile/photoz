package com.jetbrains.oto.photoz.clone.repository;

import com.jetbrains.oto.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}
