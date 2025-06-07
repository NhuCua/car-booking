import service.impl.MenuService;
import service.impl.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        MenuService menuService = new MenuService(userService);
        userService.initListUsers();


        menuService.welcome();
        menuService.menu();
    }


}