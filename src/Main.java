import service.impl.BookingService;
import service.impl.CarService;
import service.impl.MenuService;
import service.impl.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        CarService carService = new CarService();
        BookingService bookingService = new BookingService();

        MenuService menuService = new MenuService(userService, carService,bookingService);

        bookingService.initListBookings();

        menuService.welcome();
        menuService.menu();
    }


}