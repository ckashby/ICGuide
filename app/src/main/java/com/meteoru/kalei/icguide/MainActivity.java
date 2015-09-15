package com.meteoru.kalei.icguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.candy:
                goCandy();
                return true;
            case R.id.action_settings:
//                openSettings();
                return true;
            case R.id.coffee:
                goCoffee();
                return true;
            case R.id.dairy:
                goDairy();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void goCandy() {
        Intent intent = new Intent(this, CandyActivity.class);
        startActivity(intent);
    }

    private void goCoffee() {
        Intent intent = new Intent(this, CoffeeActivity.class);
        startActivity(intent);
    }

    private void goDairy() {
        Intent intent = new Intent(this, DairyActivity.class);
        startActivity(intent);
    }




}
