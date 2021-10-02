package me.aprizal.makanankhassasak.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import me.aprizal.makanankhassasak.R;
import me.aprizal.makanankhassasak.adapter.ListMenuAdapter;
import me.aprizal.makanankhassasak.model.ListMenu;
import me.aprizal.makanankhassasak.model.ModelMenu;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMenu;
    private final ArrayList<ModelMenu> menuArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMenu=findViewById(R.id.rv_menu);
        rvMenu.setHasFixedSize(true);

        menuArrayList.addAll(ListMenu.getListMenu());
        showMenuRecyclerView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("NonConstantResourceId")
    private void setMode(int itemId) {
        if (itemId == R.id.about) {
            startActivity(new Intent(this,AboutActivity.class));
        }
    }

    private void showMenuRecyclerView() {
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        ListMenuAdapter listMenuAdapter = new ListMenuAdapter(menuArrayList);
        rvMenu.setAdapter(listMenuAdapter);
    }
}