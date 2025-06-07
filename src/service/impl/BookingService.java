package service.impl;

import Dto.BookingResponseDTO;
import dao.iml.BookingDao;
import dao.iml.CarDao;
import dao.iml.UserDao;
import model.Booking;
import model.Car;
import model.User;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.stream.Collectors;

import java.util.List;

public class BookingService {
    BookingDao bookingDao = new BookingDao();

    UserDao userDao = new UserDao();

    CarDao carDao = new CarDao();

    UserService userService = new UserService();
    CarDao carDao = new CarDao();

    Scanner scanner = new Scanner(System.in);


    public void viewAll() {
        List<Booking> bookings = bookingDao.getAll();
        List<User> users = userDao.getAll();
        List<Car> cars = carDao.getAll();

        List<BookingResponseDTO> bookingUsers = bookings.stream()
                .flatMap(booking -> users.stream()
                        .filter(user ->Objects.equals(user.getId(), booking.getIdUser()))
                        .map(user -> new BookingResponseDTO( booking.getIdCar(), booking.getIdUser(),null ,user.getName(), booking.getTimeStart(), booking.getTimeEnd())))
                .toList();

        List<BookingResponseDTO> bookingCar = bookingUsers.stream()
                .flatMap(bookingUser -> cars.stream()
                        .filter(car ->Objects.equals(car.getId(), bookingUser.getIdCar()))
                        .map(car -> new BookingResponseDTO( bookingUser.getIdCar(), bookingUser.getIdName(),car.getName() ,bookingUser.getNameUser(), bookingUser.getTimeStart(), bookingUser.getTimeEnd())))
                .toList();

        bookingCar.forEach(System.out::println);
    }

    public void addBooking() {
        List<User> users = userDao.getAll();

        List<Car> cars = carDao.getAll();

        System.out.println("Choose a user to book a car:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).getName() + " (ID: " + users.get(i).getId() + ")");
        }
        int indexUserChoose = scanner.nextInt();
        scanner.nextLine();

        String idUser = userDao.getUserIdByIndex(indexUserChoose - 1);

        System.out.println("Choose a car to book a car:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + ". " + cars.get(i).getName() + " (ID: " + cars.get(i).getId() + ")");
        }

<<<<<<< Updated upstream

        String idCar = scanner.nextLine();
=======
        int indexCarChoose = scanner.nextInt();
        scanner.nextLine();
        String idCar = carDao.getCarIdByIndex(indexCarChoose - 1);
>>>>>>> Stashed changes

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
