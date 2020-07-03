package com.example.dustin0128.internet;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv);
        haveInternet();
    }

    private void haveInternet() {
        boolean result = true;

        ConnectivityManager connManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        assert connManager != null;
        NetworkInfo info = connManager.getActiveNetworkInfo();

        if (info == null || !info.isConnected()) {

            textView.setText("XXXX");

//        } else if (!info.isAvailable()) {
//
//            textView.setText("XXXs");
        }
        else {

            textView.setText("aaaaaaaaa");
        }

    }
}
