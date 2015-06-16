package com.homepage.web.services;

public interface ReservationService {
	String checkIn(int floor, int row, String id);
	String checkOut(int floor, int row, String id);
	String[][] showStatus();
	void process();
	String[][] checkIn();
}
