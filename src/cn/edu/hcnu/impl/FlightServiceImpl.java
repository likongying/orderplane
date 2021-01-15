package cn.edu.hcnu.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.FlightDaoIml;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public class
FlightServiceImpl implements IFlightService {
    IFlightDao iFlightDao;
    public  FlightServiceImpl(){
        iFlightDao=new FlightDaoIml();
    }
    @Override
    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);
        System.out.println("界面传来的航班信息:"+flight);

    }


    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        return iFlightDao.getAllFlights();
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) throws SQLException {

        return iFlightDao.getFlightByDepartureTime(departureTime);
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) throws SQLException {
        return iFlightDao.getFlightByDepartureAirPort(departureAirPort);
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) throws SQLException {

        return iFlightDao.getFlightByDestinationAirPort(destinationAirPort);
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
