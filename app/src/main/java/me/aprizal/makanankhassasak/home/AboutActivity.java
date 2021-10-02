package me.aprizal.makanankhassasak.home;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import me.aprizal.makanankhassasak.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(R.string.about);
        }

        Button btnProfile=findViewById(R.id.btn_profile);
        btnProfile.setOnClickListener(v -> {
            String url = "https://www.dicoding.com/users/aprizalzal";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            if (!haveNetwork()){
                Snackbar.make(v,v.getResources().getString(R.string.check_internet), Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .setTextColor(getColor(R.color.white))
                        .setBackgroundTint(getColor(R.color.teal_200))
                        .show();
            }else {
                Toast.makeText(this, getString(R.string.open_browser),Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
    private boolean haveNetwork() {
        boolean haveConnection =false;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo !=null && activeNetworkInfo.isConnected()){
            haveConnection=true;
        }
        return haveConnection;
    }
}