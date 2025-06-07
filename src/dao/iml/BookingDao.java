package dao.iml;

import dao.Dao;
import model.Booking;
import model.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BookingDao implements Dao<Booking> {
    private final List<Booking> bookings = new ArrayList<>();

    public BookingDao() {
        Date date = new Date(2015, Calendar.APRIL, 2);
        bookings.add(new Booking("1", "1", date, date));
        bookings.add(new Booking("2", "2", date, date));
        bookings.add(new Booking("3", "3", date, date));
    }

    @Override
    public List<Booking> getAll() {
        return bookings;
    }

    @Override
    public void viewAll() {
        for (Booking booking : bookings) {
            System.out.println(booking.toString());
            System.out.println("-------------------");
        }
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        System.out.println("Booking added: " + booking);
    }


    public List<String> getAllUserBookedCar() {
        return bookings.stream().map(Booking::getIdUser).toList();
    }
}
