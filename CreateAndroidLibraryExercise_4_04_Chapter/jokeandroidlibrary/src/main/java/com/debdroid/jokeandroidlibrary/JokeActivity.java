package com.debdroid.jokeandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String EXT_JOKE = "ext_joke";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getStringExtra(EXT_JOKE);

        TextView jokeTextView = findViewById(R.id.jokeTextView);

        jokeTextView.setText(joke);
    }
}
