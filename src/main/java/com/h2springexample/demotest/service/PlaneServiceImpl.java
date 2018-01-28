package com.h2springexample.demotest.service;

import com.h2springexample.demotest.entities.Plane;
import com.h2springexample.demotest.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService {
    private PlaneRepository planeRepository;

    @Autowired
    public PlaneServiceImpl(PlaneRepository planeRepository){
        this.planeRepository = planeRepository;
    }
    @Override
    public List<Plane> findAll() {
        return planeRepository.findAll();
    }

    @Override
    public List<Plane> sortedByFlightRange() {
        return planeRepository.sortedByFlightRange();
    }

    @Override
    public List<Plane> findByRange(int fromReq, int toReq) {
        ArrayList<Plane> planes = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb","sa","");
            PreparedStatement statement = connection
                    .prepareStatement("select * from plane where FUELCONSUMPTION>=? and FUELCONSUMPTION<=?")) {
            Class.forName("org.h2.Driver");
            statement.setInt(1,fromReq);
            statement.setInt(2,toReq);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Plane plane = new Plane();
                plane.setId(resultSet.getInt("id"));
                plane.setName(resultSet.getString("name"));
                plane.setCapaciti(resultSet.getInt("capaciti"));
                plane.setFLIGHTRANGE(resultSet.getInt("flightrange"));
                plane.setCARRYINGCAPACITI(resultSet.getInt("carryingcapaciti"));
                plane.setFUELCONSUMPTION(resultSet.getInt("fuelconsumption"));
                planes.add(plane);
            }
            resultSet.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return planes;
    }
}
