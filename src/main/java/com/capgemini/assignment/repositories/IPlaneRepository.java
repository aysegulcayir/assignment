package com.capgemini.assignment.repositories;

import com.capgemini.assignment.models.Plane;

import java.util.List;

public interface IPlaneRepository {
    List<Plane> getPlanes();
    Plane savePlane(Plane plane);
}
