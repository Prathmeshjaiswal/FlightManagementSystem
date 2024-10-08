package service;
import java.util.Date;
import repository.FlightRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import model.Flight;
@RequiredArgsConstructor
@Service
public class FlightService {
	   @Autowired
	    private FlightRepository flightRepository;

	    public List<Flight> getAllFlights() {
	        return flightRepository.findAll();
	    }

	    public Flight getFlightById(int id) {
	        return flightRepository.findById(id).get();
	    }

	    public List<Flight> getFlightsByCities(String departureCity, String arrivalCity) {
	        return flightRepository.findByDepartureCityAndArrivalCity(departureCity, arrivalCity);
	    }

	    public List<Flight> getFlightsByDateRange(Date startDate, Date endDate) {
	        return flightRepository.findByDepartureDateBetween(startDate, endDate);
	    }

	    public Flight createFlight(Flight flight) {
	        return flightRepository.save(flight);
	    }

	    public Flight updateFlight(Flight flight) {
	        return flightRepository.save(flight);
	    }

	    public void deleteFlight(int id) {
	        flightRepository.deleteById(id);
	    }
	
}
   