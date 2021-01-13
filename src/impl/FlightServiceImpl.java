package impl;

import cn.edu.hcnu.bean.Flight;
import dao.IFlightDao;
import dao.FlightDaoIml;

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
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
