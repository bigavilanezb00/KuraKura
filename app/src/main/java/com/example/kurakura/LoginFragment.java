package com.example.kurakura;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginFragment extends Fragment {

    NavController navController;
    Button registrate_button;
    Button enviar_button;
    ImageButton twitter_button;
    ImageButton facebook_button;
    ImageButton gmail_button;
    TextView olvidado_password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        enviar_button = view.findViewById(R.id.enviar_button);
        registrate_button = view.findViewById(R.id.registrate_button);
        twitter_button = view.findViewById(R.id.twitter_button);
        facebook_button = view.findViewById(R.id.facebook_button);
        gmail_button = view.findViewById(R.id.gmail_button);
        olvidado_password = view.findViewById(R.id.olvidado_password);

        enviar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_homeFragment);
            }
        });

        registrate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_registroFragment);
            }
        });

        twitter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_twitterFragment);
            }
        });

        facebook_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_facebookFragment);
            }
        });

        gmail_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_gmailFragment);
            }
        });

        olvidado_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_resetPasswordFragment);
            }
        });

    }
}