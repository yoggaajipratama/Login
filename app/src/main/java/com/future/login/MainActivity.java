package com.future.login;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nik, pass;
    String user, getUser;
    Button btn, lupa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nik = (EditText) findViewById(R.id.nik);
        pass = (EditText) findViewById(R.id.pass);
        btn = (Button) findViewById(R.id.btn);
        lupa = (Button) findViewById(R.id.lupa);

        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Lupa.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = nik.getText().toString().trim();
                getUser = pass.getText().toString().trim();

                String  real = "1167050168";

                if (user.equals(real)&& getUser.equals("123")){
                    Intent intent = new Intent(MainActivity.this,Menu.class);
                    startActivity(intent);
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("NIK dan Password tidak cocok")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });


    }
}
