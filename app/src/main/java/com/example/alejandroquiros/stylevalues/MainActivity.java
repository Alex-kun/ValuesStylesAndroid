package com.example.alejandroquiros.stylevalues;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        BlueFragment fragBlue = null;
        RedFragment fragRed = null;
        OrangeFragment fragOrange = null;

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_blue) {

            Toast.makeText(this, "Azul", Toast.LENGTH_SHORT).show();
            fragBlue = new BlueFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,fragBlue).commit();
            return true;

        } else if (id == R.id.action_red) {

            Toast.makeText(this, "Rojo", Toast.LENGTH_SHORT).show();
            fragRed = new RedFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,fragRed).commit();
            return true;

        } else if (id == R.id.action_orange) {
            Toast.makeText(this, "Naranja", Toast.LENGTH_SHORT).show();
            fragOrange = new OrangeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,fragOrange).commit();




            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
