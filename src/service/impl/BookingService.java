package service.impl;

import dao.iml.BookingDao;
import dao.iml.UserDao;
import model.User;

import java.util.List;
import java.util.Scanner;

public class BookingService {
    BookingDao bookingDao = new BookingDao();

    UserDao userDao = new UserDao();

    Scanner scanner = new Scanner(System.in);


    public void viewAll() {
        bookingDao.viewAll();
    }

    public void addBooking() {
        List<User> users = userDao.getAll();
        System.out.println("Choose a user to book a car:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).getName() + " (ID: " + users.get(i).getId() + ")");
        }
        int indexUserChoose = scanner.nextInt();




    }




}
