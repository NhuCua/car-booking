import service.impl.BookingService;
import service.impl.MenuService;
import service.impl.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        BookingService bookingService = new BookingService();

        MenuService menuService = new MenuService(userService);
        userService.initListUsers();
        bookingService.initListBookings();

        menuService.welcome();
        menuService.menu();
    }


}