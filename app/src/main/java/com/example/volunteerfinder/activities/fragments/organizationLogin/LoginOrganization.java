package com.example.volunteerfinder.activities.fragments.organizationLogin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.volunteerfinder.R;
import com.example.volunteerfinder.services.user.IUserService;
import com.example.volunteerfinder.services.user.UserService;
import com.google.android.material.textfield.TextInputEditText;


public class LoginOrganization extends Fragment {

    private TextInputEditText emailField;
    private TextInputEditText passwordField;

    private Button loginButton;

    private final IUserService userService = new UserService();

    SharedPreferences sp;

    public LoginOrganization() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initSetup();
        loginButton.setOnClickListener(event -> login());
    }

    private void login() {
        if(validData()) {
            //TODO Call login function here please
        }
    }

    private boolean validData() {
        if (emailField.getText().toString().equals("")) {
            return false;
        }
        if (passwordField.getText().toString().equals("")) {
            return false;
        }
        return true;
    }

    private void initSetup() {
        emailField = getView().findViewById(R.id.emailField);
        passwordField = getView().findViewById(R.id.passwordField);

        loginButton = getView().findViewById(R.id.loginButton);

        sp = getActivity().getSharedPreferences("UserInfo", Context.MODE_PRIVATE);

    }
}