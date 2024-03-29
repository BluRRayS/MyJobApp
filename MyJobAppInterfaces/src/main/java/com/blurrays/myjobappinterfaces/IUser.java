package com.blurrays.myjobappinterfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public abstract class IUser {


    public IUser(int id, String username, String email, String firstname, String lastname, String phone, List<IRole> roles, UserType type, String password, String salt, LocalDate dateOfBirth) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.roles = roles;
        this.type = type;
        this.password = password;
        this.salt = salt;
        this.dateOfBirth = dateOfBirth;
    }

    public IUser() {
    }

    private int id;
    private String username;
    private String email;
    private String firstname;
    private String lastname;
    private String phone;
    private List<IRole> roles;
    private UserType type;
    private String password;
    private String salt;
    private LocalDate dateOfBirth;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<IRole> getRoles() {
        return roles;
    }

    public void setRoles(List<IRole> roles) {
        this.roles = roles;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
