package com.example.iste_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText)findViewById(R.id.Nmae_txt);
        Password = (EditText)findViewById(R.id.Password_txt);
        Login = (Button)findViewById(R.id.Login_button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Username.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String username,String userpassword){
        if ((username.equals("abcde")) && (userpassword.equals("12345"))){
            Toast myToast1 = Toast.makeText(this,"Login Successfully!",Toast.LENGTH_SHORT);
            myToast1.show();
        } else {
            Toast myToast2 = Toast.makeText(this,"Incorrect Username or Password",Toast.LENGTH_SHORT);
            myToast2.show();
        }
    }

}
