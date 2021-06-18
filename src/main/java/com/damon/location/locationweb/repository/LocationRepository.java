package com.damon.location.locationweb.repository;

import com.damon.location.locationweb.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
