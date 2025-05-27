//Encapsulation.

//Question:
//Secure Login System
//Design a class UserLogin with:
//
//private fields username and password.
//
//Provide public setters and getters.
//
//Add a method login() that checks if the provided username and password match predefined values (e.g., "admin", "1234").

package oops.encapsulation;

import java.util.Scanner;

class UserLogin {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Method to validate credentials
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    // Welcome message
    public String details() {
        return "Login successful!\nWelcome, " + username;
    }
}

public class Program_04 {
    public static void main(String[] args) {
        System.out.println("SECURE LOGIN SYSTEM");

        Scanner sc = new Scanner(System.in);
        UserLogin ul = new UserLogin();

        // Set predefined credentials
        ul.setUsername("admin");
        ul.setPassword("1803");

        // Input from user
        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        // Login check
        if (ul.login(u, p)) {
            System.out.println(ul.details());
        } else {
            System.out.println("❌ Invalid username or password!");
        }
    }
}

