package com.meteoru.kalei.icguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CandyActivity extends AppCompatActivity {
    ListView lvCandy;
    ArrayList<String> alCandy;
    ArrayAdapter<String> aaCandy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candy);
        lvCandy = (ListView) findViewById(R.id.lvCandy);
        alCandy = new ArrayList<>();
        aaCandy = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                alCandy
        );
        lvCandy.setAdapter(aaCandy);
        aaCandy.add("Butterscotch");
        aaCandy.add("Carob,");
        aaCandy.add("Caramel,");
        aaCandy.add("Divinity");
        aaCandy.add("Mint");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_candy, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
