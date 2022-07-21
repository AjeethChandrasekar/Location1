package com.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entites.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
