package service.impl;

import dao.iml.BookingDao;

public class BookingService {
    BookingDao bookingDao = new BookingDao();

    public void viewAll() {
        bookingDao.viewAll();
    }
}
