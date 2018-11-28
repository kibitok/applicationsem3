package com.semaplication;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        MyReceiver receiver = new MyReceiver();
        registerReceiver(receiver, filter);


        //startService(new Intent(this, MyService.class));

        //difference between service and intent service
        //broadcast receiver and it's applications
        //application permissions (runtime permissions vs manifest permissions)
        //activity life cycles


    }

@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.options, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

//respond to menu item selection
        switch (item.getItemId()) {

            case R.id.settings:

                Toast.makeText(this,"Settings", Toast.LENGTH_LONG).show();

                return true;

            case R.id.about:

                Toast.makeText(this,"about", Toast.LENGTH_LONG).show();

                return true;
            case R.id.help:

                Toast.makeText(this,"about", Toast.LENGTH_LONG).show();

                return true;
            default:

                return super.onOptionsItemSelected(item);

        }
    }

    public void settings(MenuItem item) {
        Toast.makeText(this,"Settings", Toast.LENGTH_LONG).show();
    }
    public void about(MenuItem item) {
        Toast.makeText(this,"about", Toast.LENGTH_LONG).show();
    }
    public void help(MenuItem item) {
        Toast.makeText(this,"help", Toast.LENGTH_LONG).show();
    }
    public void button (View view){
        startActivity(new Intent(this, sound.class));

        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);
    }
}

