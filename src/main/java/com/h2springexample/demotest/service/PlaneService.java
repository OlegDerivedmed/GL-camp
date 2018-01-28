package com.h2springexample.demotest.service;

import com.h2springexample.demotest.entities.Plane;

import java.util.List;

public interface PlaneService {
    List<Plane> findAll();
    List<Plane> sortedByFlightRange();
    List<Plane> findByRange(int fromReq, int toReq);
}
