package com.victorcocuz.thegreenwichunion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        LinearLayout addressLayout = (LinearLayout) findViewById(R.id.address);
        addressLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.uk/maps?q=greenwich+union&um=1&ie=UTF-8&sa=X&ved=0ahUKEwjGuIavv8fUAhVEKlAKHdnRDaEQ_AUICigB"));
                startActivity(mapIntent);
            }
        });

        LinearLayout phoneLayout = (LinearLayout) findViewById(R.id.phone);
        phoneLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +44 020 8692 6258"));
                startActivity(mapIntent);
            }
        });
    }
}

