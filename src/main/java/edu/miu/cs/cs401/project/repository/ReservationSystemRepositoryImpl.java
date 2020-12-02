package edu.miu.cs.cs401.project.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import edu.miu.cs.cs401.project.domain.Address;
import edu.miu.cs.cs401.project.domain.Airline;
import edu.miu.cs.cs401.project.domain.Airport;
import edu.miu.cs.cs401.project.domain.Flight;
import edu.miu.cs.cs401.project.domain.Passenger;
import edu.miu.cs.cs401.project.domain.Reservation;

public class ReservationSystemRepositoryImpl implements ReservationSystemRepository {
	
	private Map<String, Airport> airports = new HashMap<>();

	ReservationSystemRepositoryImpl() {
		super();
		setupAirports();
	}
	
	private void setupAirports() {
		
		Airport airport;
		
		airport = new Airport("CID", "Eastern Iowa Airport", new Address());
		airports.put(airport.getId(), airport);
		
		airport = new Airport("ORD", "Chicago O'Hare International Airport", new Address());
		airports.put(airport.getId(), airport);
		
		airport = new Airport("CLT", "Charlotte Douglas International Airport", new Address());
		airports.put(airport.getId(), airport);
		
	}

	@Override
	public Collection<Airport> findAllAirports() {
		return airports.values();
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {
		for(Airport airport : findAllAirports()) {
			if(airport.getCode().equalsIgnoreCase(airportCode)) {
				return airport;
			}
		}
		return null;
	}

	@Override
	public Collection<Airport> findAirportsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Airline> findAirlinesByAirportCode(String airportCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Flight> findFlightsFromTo(String departure, String arrival) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Reservation> findReservationsByPassengerId(Integer passengerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Passenger> findPassengersByAgentCode(String agentCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
