import service.impl.CarService;
import service.impl.MenuService;
import service.impl.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        CarService carService = new CarService();
        MenuService menuService = new MenuService(userService, carService);


        menuService.welcome();
        menuService.menu();
    }


}