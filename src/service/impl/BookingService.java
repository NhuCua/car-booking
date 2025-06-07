package service.impl;

import model.Booking;
import model.Car;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingService {
    public List<Booking> initListBookings() {
        Date date = new Date(2015, 3, 2);
        List<Booking> bookings = new ArrayList<Booking>();
        bookings.add(new Booking("1", "1", date, date));
        return  bookings;
    }
}
