package com.debdroid.createjavalibraryexercise_4_20_chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.debdroid.manualjavamodule.JokeDeb;
import com.debdroid.manualmoduleaddedfromas.JokeSmith;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JokeSmith jokeSmith = new JokeSmith();
        JokeDeb jokeDeb = new JokeDeb();

        Toast.makeText(this,jokeDeb.getJoke(),Toast.LENGTH_SHORT).show();
    }
}
