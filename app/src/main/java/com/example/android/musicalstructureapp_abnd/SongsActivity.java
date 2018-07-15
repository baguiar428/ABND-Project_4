package com.example.android.musicalstructureapp_abnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Kasabian", "Re-Wired"));
        songs.add(new Song("Kasabian", "You're in Love with a Psycho"));
        songs.add(new Song("Kasabian","Eez-eh"));
        songs.add(new Song("G-Eazy", " Me, Myself & I"));
        songs.add(new Song("G-Eazy", "I Mean It"));
        songs.add(new Song("Diskopunk", "Antonio America"));
        songs.add(new Song("Diskopunk", "Fire"));
        songs.add(new Song("Grimes", "Kill V. Maim"));
        songs.add(new Song("The Subways", "Rock & Roll Queen"));

    }
}
