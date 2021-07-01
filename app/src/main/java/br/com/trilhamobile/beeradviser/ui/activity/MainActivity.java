package br.com.trilhamobile.beeradviser.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.trilhamobile.beeradviser.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void choiceBeer(View view) {
        Intent intent = new Intent(this, FindBeerActivity.class);
        startActivity(intent);
        finish();
    }
}