package com.example.metrocc_app;import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.metrocc_app.DialogBox.Dialogs;
import com.example.metrocc_app.Login.Presenter.ILoginPresenter;
import com.example.metrocc_app.Login.Presenter.LoginPresenter;
import com.example.metrocc_app.Login.view.ILoginView;

public class MainActivity extends Dialogs implements ILoginView {
    EditText email, password;
    ImageButton button;
    RadioButton radioButton;
    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresenter = new LoginPresenter(this);

        email = (EditText) findViewById(R.id.etEmailId);
        password = (EditText) findViewById(R.id.etPassword);
        button = (ImageButton) findViewById(R.id.btnLogin);
        radioButton = (RadioButton) findViewById(R.id.rBtnForgotPassword);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                loginPresenter.onLogin(email.getText().toString(), password.getText().toString());
            }

        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              showPopup(2);
             }
        });

    }


    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void nextPage() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }


}
