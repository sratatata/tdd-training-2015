package com.samsung.training.tdd.tripservicekata.trip;

import java.util.List;

import com.samsung.training.tdd.tripservicekata.exception.CollaboratorCallException;
import com.samsung.training.tdd.tripservicekata.user.User;

public class TripDAO {

	public static List<Trip> findTripsByUser(User user) {
		throw new CollaboratorCallException(
				"TripDAO should not be invoked on an unit test.");
	}
	
}