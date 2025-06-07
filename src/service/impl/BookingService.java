package service.impl;

import model.Booking;
import model.User;
import service.IView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BookingService implements IView {
    List<Booking> bookings = new ArrayList<Booking>();

    public List<Booking> initListBookings() {
        Date date = new Date(2015, Calendar.APRIL, 2);
        bookings.add(new Booking("1", "1", date, date));
        return  bookings;
    }

    @Override
    public void view() {
        for (Booking bookings : bookings) {
            System.out.println(bookings);
        }
    }
}
