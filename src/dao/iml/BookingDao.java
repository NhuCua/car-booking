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
        return List.of();
    }

    @Override
    public void viewAll() {
        for (Booking bookings : bookings) {
            System.out.println(bookings.getIdCar());
            System.out.println(bookings.getIdUser());
            System.out.println(bookings.getTimeStart());
            System.out.println(bookings.getTimeEnd());
            System.out.println("-------------------");
        }
    }
}
