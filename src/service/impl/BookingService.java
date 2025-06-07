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

import java.util.List;

public class BookingService {
    BookingDao bookingDao = new BookingDao();

    UserDao userDao = new UserDao();

    CarDao carDao = new CarDao();

    UserService userService = new UserService();

    Scanner scanner = new Scanner(System.in);


    public void viewAll() {
        List<Booking> bookings = bookingDao.getAll();
        List<BookingResponseDTO> result = new ArrayList<>();
        for (Booking booking : bookings) {
            User user = userDao.getById(booking.getIdUser());
            Car car = carDao.getById(booking.getIdCar());
            result.add(new BookingResponseDTO(
                    booking.getIdCar(),
                    booking.getIdUser(),
                    car.getName(),
                    user.getName(),
                    booking.getTimeStart(),
                    booking.getTimeEnd()
            ));
        }
        result.forEach(System.out::println);
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

        ///--------
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + ". " + cars.get(i).getName() + " (ID: " + cars.get(i).getId() + ")");
        }

        String idCar = "";
        while (true) {
            System.out.println("Choose a car to book a car:");
            int indexCarChoose = scanner.nextInt();
            scanner.nextLine();
            if(indexCarChoose < 0  || indexCarChoose >= cars.size()) {
                System.out.println("You have chosen car: " + cars.get(indexCarChoose - 1).getName());
                break;
            } else {
                carDao.getCarIdByIndex(indexCarChoose - 1);
            }
        }


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
