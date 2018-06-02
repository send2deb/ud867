package com.debdroid.createandroidlibraryexercise_4_04_chapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.debdroid.jokeandroidlibrary.JokeActivity;
import com.debdroid.jokejavalibrary.CreateJoke;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showJoke(View view) {
        CreateJoke createJoke = new CreateJoke();
        String joke = createJoke.getJoke();

        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra(JokeActivity.EXT_JOKE, joke);
        startActivity(intent);
    }
}
