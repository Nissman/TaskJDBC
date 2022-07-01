package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("1", "1", (byte) 1);
        System.out.println("User с именем – "+ userService.getAllUsers().get(0).getName() +" добавлен в базу данных");
        userService.saveUser("2", "2", (byte) 2);
        System.out.println("User с именем – 2 добавлен в базу данных");
        userService.saveUser("3", "3", (byte) 3);
        System.out.println("User с именем – 3 добавлен в базу данных");
        userService.saveUser("4", "4", (byte) 4);
        System.out.println("User с именем – 4 добавлен в базу данных");
        userService.getAllUsers()
                .forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
