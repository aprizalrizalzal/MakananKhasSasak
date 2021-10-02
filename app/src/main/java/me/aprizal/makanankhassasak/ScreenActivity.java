package me.aprizal.makanankhassasak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import me.aprizal.makanankhassasak.home.MainActivity;

public class ScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(ScreenActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}