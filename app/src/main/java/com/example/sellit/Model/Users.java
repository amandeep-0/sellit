package com.example.sellit.Model;

public class Users
{
    private String name, registration, phone, password;

    public Users()
    {

    }

    public Users(String name, String phone, String registration, String password)
    {
        this.name=name;
        this.phone=phone;
        this.registration=registration;
        this.password=password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

