/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_shopping_mangement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class AdminOrStaff extends User {
    private String username;
    private String usertype;
    private String email;
    private String contactnumber;
    private String address;
    private String password;

    public AdminOrStaff() {
    }
    
    @Override
    public boolean isUsernameTaken(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader("UserAccount.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("/");
                if (parts[1].equals(username)) {
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error checking username: " + e.getMessage());
        }
        return false;
    }
    
    @Override
    public boolean isValidLogin(String username, String password) {
        // read stored user information from text file
        try (Scanner scanner = new Scanner(new File("UserAccount.txt"))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split("/");
                String storedUsername = parts[1];
                String storedPassword = parts[6];
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
    
    public AdminOrStaff getUserData(String username) {
        try (Scanner scanner = new Scanner(new File("UserAccount.txt"))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split("/");
                String storedUsername = parts[1];
                String usertype = parts[2];
                String email = parts[3];
                String contactnumber = parts[4];
                String address = parts[5];
                String password = parts[6];
                if (username.equals(storedUsername)) {
                   AdminOrStaff ad = new AdminOrStaff();
                   ad.setUsername(storedUsername);
                   ad.setUsertype(usertype);
                   ad.setEmail(email);
                   ad.setContactnumber(contactnumber);
                   ad.setAddress(address);
                   ad.setPassword(password);
                   return ad;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null; // user not found
    }

    public String getUsername() {
        return username;
    }

    public String getUsertype() {
        return usertype;
    }

    public String getEmail() {
        return email;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
