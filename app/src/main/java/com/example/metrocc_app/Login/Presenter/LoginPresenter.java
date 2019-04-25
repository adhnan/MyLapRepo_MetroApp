package com.example.metrocc_app.Login.Presenter;


import com.example.metrocc_app.Login.Model.User;
import com.example.metrocc_app.Login.view.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {

        User user = new User(email, password);
        boolean isLoginSuccess = user.isValid();

        if (isLoginSuccess) {
            loginView.onLoginResult("Login Successful");
            loginView.nextPage();
        } else {
            loginView.onLoginResult("Login Error");
        }
    }
}
