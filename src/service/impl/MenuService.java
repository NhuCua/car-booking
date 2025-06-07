package service.impl;


import service.IView;

import java.util.Scanner;

public class MenuService implements IView {
    private static final Scanner scanner = new Scanner(System.in);

    private final UserService userService;

    public MenuService(UserService userService) {
        this.userService = userService;
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
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Booking car...");
                    break;
                case 2:
                    System.out.println("View all users booked car");
                    break;
                case 3:
                    System.out.println(" View all booking");

                    break;
                case 4, 5:
                    break;
                case 6:
                    userService.view();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
                    scanner.close();
                    return;
            }


        }


    }


    @Override
    public void view() {

    }
}
