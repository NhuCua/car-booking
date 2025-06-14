package service.impl;

import java.util.Scanner;

public class MenuService  {
    private static final Scanner scanner = new Scanner(System.in);

    private final UserService userService;
    private final BookingService bookingService;

    private final CarService carService;


    public MenuService(UserService userService, CarService carService, BookingService bookingService) {
        this.userService = userService;
        this.carService = carService;
        this.bookingService = bookingService;
    }


    public void welcome() {
        System.out.println("Welcome to booking system!");
        System.out.println("Enter your name?");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name + ". How can I help you today?");
    }

    public void menu() {
        while (true) {
            System.out.println("1. Booking car");
            System.out.println("2. View all users booked car");
            System.out.println("3. View all booking");
            System.out.println("4. View all cars");
            System.out.println("5. View all electric cars");
            System.out.println("6. View all users");
            System.out.println("7. Exit");

            System.out.println("Choose an option");

            String choose = scanner.nextLine().trim();

            switch (choose) {
                case "1":
                    bookingService.addBooking();
                    break;
                case "2":
                    bookingService.viewAllUserBookedCar();
                    break;
                case "3":
                    System.out.println(" View all bookings");
                    bookingService.viewAll();
                    break;
                case "4":
                    System.out.println("View all cars");
                    carService.viewAll();
                    break;
                case "5":
                    System.out.println("View all electric cars");
                    carService.viewAllElectricCars();
                    break;
                case "6":
                    userService.viewAll();
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
}
