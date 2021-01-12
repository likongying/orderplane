package imp;

import cn.edu.hcnu.bean.Flight;
import dao.IFlightDao;
import impl.FlightDaoImI;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {
    IFlightDao iFlightDao;
    public  FlightServiceImpl(){
        iFlightDao=new FlightDaoImI();
    }
    @Override
    public void insertFlight(Flight flight) {
        System.out.println("界面传来的航班信息:"+flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
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
