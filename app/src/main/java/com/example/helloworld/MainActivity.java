package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private EditText UserName;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName = (EditText)findViewById(R.id.userName);
        Password =  (EditText) findViewById(R.id.password);
    }

    public void logIn(View view)
    {
        String username = UserName.getText().toString();
        String password = Password.getText().toString();
        if(username.isEmpty()||password.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Username or Password cannot be empty",Toast.LENGTH_LONG);
        }
        else
        {
            if(username.equals("Pankaj")&&password.equals("Pankaj123"))
            {
                Toast.makeText(getApplicationContext(),"Welcome Pankaj",Toast.LENGTH_LONG);
                Intent intent = new Intent(this, Dashboard.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Username or password incorrect", Toast.LENGTH_LONG);
            }
        }

    }

    public void signUp(View view)
    {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}
