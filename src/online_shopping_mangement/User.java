/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_shopping_mangement;


public abstract class User {
    
    public abstract boolean isUsernameTaken(String username);
    
    public abstract boolean isValidLogin(String username,String password);
}

