package com.samsung.training.tdd.tripservicekata;

import com.samsung.training.tdd.tripservicekata.exception.UserNotLoggedInException;
import com.samsung.training.tdd.tripservicekata.trip.Trip;
import com.samsung.training.tdd.tripservicekata.trip.TripDAO;
import com.samsung.training.tdd.tripservicekata.user.User;
import com.samsung.training.tdd.tripservicekata.user.UserSession;

import java.util.ArrayList;
import java.util.List;

public class TripService_Original {

	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		List<Trip> tripList = new ArrayList<Trip>();
		User loggedUser = UserSession.getInstance().getLoggedUser();
		boolean isFriend = false;
		if (loggedUser != null) {
			for (User friend : user.getFriends()) {
				if (friend.equals(loggedUser)) {
					isFriend = true;
					break;
				}
			}
			if (isFriend) {
				tripList = TripDAO.findTripsByUser(user);
			}
			return tripList;
		} else {
			throw new UserNotLoggedInException();
		}
	}
	
}
