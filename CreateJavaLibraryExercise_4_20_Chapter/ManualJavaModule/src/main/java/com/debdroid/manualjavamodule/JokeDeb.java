package com.debdroid.manualjavamodule;

import com.debdroid.manualmoduleaddedfromas.JokeSmith;

public class JokeDeb {

    JokeSmith jokeSmith;
    public JokeDeb() {
        jokeSmith = new JokeSmith();
    }

    public String getJoke() {
        return jokeSmith.getJoke() + " retrieved by JokeDeb";
    }
}
