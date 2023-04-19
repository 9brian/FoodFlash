package com.example.foodflash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.foodflash.databinding.ActivityMainBinding;
import com.example.foodflash.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    EditText mUsername;
    EditText mPassword;
    EditText mRetype;
    Button mSignup;

    ActivitySignUpBinding mActivitySignUpBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mActivitySignUpBinding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(mActivitySignUpBinding.getRoot());

        mUsername = mActivitySignUpBinding.usernameEdittextSignup;
        mPassword = mActivitySignUpBinding.passwordEdittextSignup;
        mRetype = mActivitySignUpBinding.retypePasswordEdittextSignup;
        mSignup = mActivitySignUpBinding.signupButtonSignup;

    }
    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, SignUpActivity.class);
        return intent;
    }
}