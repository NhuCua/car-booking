package dao.iml;

import dao.Dao;
import model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingDao implements Dao<Booking> {
    private final List<Booking> bookings = new ArrayList<>();

    @Override
    public List<Booking> getAll() {
        return bookings;
    }

    @Override
    public Booking getById(String id) {
        return null;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        System.out.println("Booking added: " + booking);
    }


    public List<String> getAllUserBookedCar() {
        return bookings.stream().map(Booking::getIdUser).toList();
    }
}
