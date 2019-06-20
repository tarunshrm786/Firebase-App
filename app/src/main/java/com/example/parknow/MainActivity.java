package com.example.parknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button loginbtn,regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn=findViewById(R.id.btn1);
        regbtn=findViewById(R.id.btn2);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        loginbtn.startAnimation(animation);

        Animation animations = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        regbtn.startAnimation(animations);
    }

    public void btn_logins(View view) {

        try {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void btn_registers(View view) {

        try {
            Intent intent = new Intent(this, Register.class);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
