package com.homepage.web.services;

public interface ReservationService {
	void alertMsg(int num);
	int inputCheck(String input, int first, int last);
	void checkIn();
	void checkOut();
	void showStatus();
	void process();
}
