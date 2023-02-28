/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_shopping_mangement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class User {
    private static String username;
    private String password;
    private String sex;
    private String address;
    private String email;
    private String phoneNumber;
    private List<String> purchaseHistory;


    public User(String username, String password, String sex, String address, String email, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.purchaseHistory = new ArrayList<String>();
    }

    public void addPurchase(String item) {
        purchaseHistory.add(item);
    }

    // Add getters and setters for all fields

    public static boolean writeToFile(User user,String role) {
        try {
            FileWriter writer = new FileWriter("users.txt", true);
            writer.write(user.getUsername() + "/" + user.getPassword() + "/" + user.getSex() + "/" + user.getAddress() + "/" + user.getEmail() + "/" + user.getPhoneNumber() + "/" + role+ "\n");
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean isUsernameTaken(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("/");
                if (parts.length == 7 && parts[0].equals(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error checking username: " + e.getMessage());
        }
        return false;
    }
    
    
    public static boolean isValidLogin(String username, String password) {
        // read stored user information from text file
        try (Scanner scanner = new Scanner(new File("users.txt"))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split("/");
                String storedUsername = parts[0];
                String storedPassword = parts[1];
                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            // handle file not found error
            e.printStackTrace();
        }

        return false;
    }
    
    
    
public static Customer getUserData(String username) {
    try (Scanner scanner = new Scanner(new File("users.txt"))) {
        while (scanner.hasNextLine()) {
            String[] parts = scanner.nextLine().split("/");
            String storedUsername = parts[0];
            String password = parts[1];
            String sex = parts[2];
            String address = parts[3];
            String email = parts[4];
            String phoneNumber = parts[5];
            if (username.equals(storedUsername)) {
                return new Customer(storedUsername, password, sex, address, email, phoneNumber);
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return null; // user not found
}
    
    public void displayUsername() {
    System.out.println("Username: " + username);
}
    
    
    
    public static void setUsername(String username) {
        User.username = username;
    }

    public static String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(List<String> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public User(String username, String password, String sex, String address, String email, String phoneNumber, List<String> purchaseHistory) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.purchaseHistory = purchaseHistory;
    }
}

