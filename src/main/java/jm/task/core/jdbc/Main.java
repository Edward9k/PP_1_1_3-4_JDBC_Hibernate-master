package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Алексей", "Венедиктов", (byte) 54);
        userService.saveUser("Алексей", "Венедистов", (byte) 25);
        userService.saveUser("Вова", "Пу", (byte) 72);
        userService.saveUser("Жирик", "Вольфович", (byte) 80);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
