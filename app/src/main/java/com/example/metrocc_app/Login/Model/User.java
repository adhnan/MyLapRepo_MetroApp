package com.example.metrocc_app.Login.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User {
    private String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isValid(){
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()) && password.length()>6 ;
    }
}
