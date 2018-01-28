package com.h2springexample.demotest.repository;

import com.h2springexample.demotest.entities.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlaneRepository extends JpaRepository<Plane, Long> {

    List<Plane> findAll();

    @Query(value = "select * from plane order by flightrange", nativeQuery = true)
    List<Plane> sortedByFlightRange();



}
