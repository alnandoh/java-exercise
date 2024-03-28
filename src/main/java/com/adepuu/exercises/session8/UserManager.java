package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//UserManager Class: This class will manage user registration, login, and authentication.
// It will have methods for creating new user accounts, authenticating users, and managing user sessions.
public class UserManager {
    private Map<String, User> users; // Map of username to User object

    public UserManager() {
        this.users = new HashMap<>();
    }

    public void registerUser(Scanner scanner) {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        User newUser = new User(username, password);
        users.put(username, newUser);
        System.out.println("User registered successfully.");
    }

    public User login(Scanner scanner) {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful. Welcome, " + user.getUsername() + "!");
            return user;
        } else {
            System.out.println("Invalid username or password.");
            return null;
        }
    }
}