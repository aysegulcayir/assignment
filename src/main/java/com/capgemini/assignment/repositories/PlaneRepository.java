package com.capgemini.assignment.repositories;

import com.capgemini.assignment.models.Plane;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PlaneRepository implements IPlaneRepository{

    private List<Plane> planes = new ArrayList<>(Arrays.asList(
            new Plane("Airbus A300 AA1",200,"Captain Jan de Vries"),
            new Plane("Boeing 747 AA2",300,"Captain Bas de Hoop")));

    public PlaneRepository(){}

    @Override
    public List<Plane> getPlanes() {
        return planes;
    }

    @Override
    public Plane savePlane(Plane plane) {
        this.planes.add(plane);
        return plane;
    }



        public Plane getPlaneByName(Plane plane) {
            for (Plane plane1 : planes) {
                if (plane1.getName() == plane.getName()) {
                    return plane1;
                }
            }
            return null;
        }
        public Plane updatePlane(Plane plane){
            Plane tempBook = getPlaneByName(plane);
            if(tempBook==null){
                return null;
            }
            tempBook.setCaptain(plane.getCaptain());
            return tempBook;

        }

    public void deletePlane(Plane plane) {
        for(Plane plane1:planes){
            if (plane1.getName()==plane.getName()){
                planes.remove(plane);
                break;
            }

        }
    }
    }

