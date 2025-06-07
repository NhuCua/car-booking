package service.impl;

import dao.iml.BookingDao;
import dao.iml.UserDao;
import model.Booking;
import model.User;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.stream.Collectors;

import java.util.List;

public class BookingService {
    BookingDao bookingDao = new BookingDao();

    UserDao userDao = new UserDao();
    UserService userService = new UserService();

    Scanner scanner = new Scanner(System.in);


    public void viewAll() {
        List<Booking> bookings = bookingDao.getAll();
        List<User> users = userDao.getAll();
        List<String> result = new ArrayList<>();

        for (Booking booking : bookings) {
            for (User user : users) {
                if (booking.getIdUser() == user.getId()) {
                    result.add("UserName: " + user.getName() + ", Car: " + booking.getIdUser());
                }
            }
        }

        //cách 2
        List<String> result2 = bookings.stream()
                .flatMap(booking -> users.stream()
                        .filter(user -> user.getId() == booking.getIdUser())
                        .map(user -> "User: " + user.getName() + ", Car: " + booking.getIdCar()))
                .collect(Collectors.toList());

        result.forEach(System.out::println);


    }

    public void addBooking() {
        List<User> users = userDao.getAll();
        System.out.println("Choose a user to book a car:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).getName() + " (ID: " + users.get(i).getId() + ")");
        }
        int indexUserChoose = scanner.nextInt();
        scanner.nextLine();

        String idUser = userDao.getUserIdByIndex(indexUserChoose - 1);

        System.out.println("Please enter the car ID you want to book:");

        String idCar = scanner.nextLine();

        System.out.println("Please enter the start time of the booking (yyyy-MM-dd):");
        String startTimeInput = scanner.nextLine();

        System.out.println("Please enter the end time of the booking (yyyy-MM-dd):");
        String endTimeInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            bookingDao.addBooking(new Booking(idCar,idUser,
                    dateFormat.parse(startTimeInput),  dateFormat.parse(endTimeInput)));

        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd-MMM-yyyy.");

        }

    }

    public void viewAllUserBookedCar() {
        List<String> userIds = bookingDao.getAllUserBookedCar();
        userService.viewAllUserByIds(userIds);
    }
}
