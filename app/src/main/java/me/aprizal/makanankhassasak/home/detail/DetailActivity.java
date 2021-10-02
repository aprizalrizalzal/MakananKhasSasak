package me.aprizal.makanankhassasak.home.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.snackbar.Snackbar;

import me.aprizal.makanankhassasak.R;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_IMAGE_MENU = "extra image menu";
    public static final String EXTRA_MENU_EAT = "extra menu eat";
    public static final String EXTRA_DETAIL_MENU = "extra detail menu";
    public static final String EXTRA_DETAIL_LOCATION = "extra detail location";

    String googleMap = "com.google.android.apps.maps";
    Uri gmIntentUri;
    Intent intent;

    @SuppressLint("QueryPermissionsNeeded")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_MENU_EAT));
        }

        ImageView imgMenu = findViewById(R.id.img_menu);
        TextView tvMenu = findViewById(R.id.tv_menu);
        TextView tvDetail = findViewById(R.id.tv_detail);
        ImageButton imgBtnShare = findViewById(R.id.btn_share);
        Button btnLocation = findViewById(R.id.btn_location);

        Glide.with(this).load(getIntent().getIntExtra(EXTRA_IMAGE_MENU,0)).apply(new RequestOptions().override(555,555)).into(imgMenu);
        tvMenu.setText(getIntent().getStringExtra(EXTRA_MENU_EAT));
        tvDetail.setText(getIntent().getStringExtra(EXTRA_DETAIL_MENU));

        imgBtnShare.setOnClickListener(v -> {
            Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, getIntent().getStringExtra(EXTRA_MENU_EAT));
            intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.share_text,getIntent().getStringExtra(EXTRA_MENU_EAT),getIntent().getStringExtra(EXTRA_DETAIL_LOCATION)));
            startActivity(Intent.createChooser(intent, "Share Via"));
        });

        btnLocation.setOnClickListener(v -> {
            gmIntentUri = Uri.parse("google.navigation:q=" + getIntent().getStringExtra(EXTRA_DETAIL_LOCATION));
            intent = new Intent(Intent.ACTION_VIEW, gmIntentUri);
            intent.setPackage(googleMap);

            if (intent.resolveActivity(getPackageManager()) != null) {
                if (!haveNetwork()){
                    Snackbar.make(v,v.getResources().getString(R.string.check_internet), Snackbar.LENGTH_LONG)
                            .setAction("Action", null)
                            .setTextColor(getColor(R.color.white))
                            .setBackgroundTint(getColor(R.color.teal_200))
                            .show();
                }else {
                    Toast.makeText(this, getString(R.string.location_on_google),Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
            } else {
                Toast.makeText(this, getString(R.string.empty_maps),Toast.LENGTH_LONG).show();
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