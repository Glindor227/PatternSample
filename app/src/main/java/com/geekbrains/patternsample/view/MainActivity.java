package com.geekbrains.patternsample.view;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.geekbrains.patternsample.R;
import com.geekbrains.patternsample.presenter.MainPresenter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements MainStateView {

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mainPresenter = new MainPresenter(this);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> mainPresenter.newPurchase());
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void presenterCallback(String toUI) {
        TextView  textRez = findViewById(R.id.outText);
        textRez.setText(textRez.getText().toString().concat(toUI));
        Snackbar.make(findViewById(android.R.id.content), "FloatingActionButton press", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show();
    }
}
