package org.example.project.services;

import org.example.project.models.User;

public class UserService {
    public void displayUser(User user) {
        System.out.println("User ID: " + user.id);
        System.out.println("User Name: " + user.name);
    }
}