package com.future.login;

import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lupa extends AppCompatActivity {

    EditText hp;
    Button kirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa);

        hp = findViewById(R.id.hp);
        kirim = findViewById(R.id.kirim);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = hp.getText().toString();

                try{
                    SmsManager smsManager = SmsManager.getDefault();
                    String pesan = "Silakan masuk halaman ini untuk reset password" +
                            "www.facebook.com";
                    smsManager.sendTextMessage(nomor,null,pesan, null, null);

                    Toast.makeText(getApplicationContext(),"Kode dikirim", Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Kode gagal dikirim", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }
}
