package com.example.android.musicalstructureapp_abnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Kasabian", "Re-Wired", R.drawable.kasabian_album_cover));
        songs.add(new Song("Kasabian", "You're in Love with a Psycho", R.drawable.kasabian_album_cover));
        songs.add(new Song("Kasabian", "Fast Fuse", R.drawable.kasabian_album_cover));
        songs.add(new Song("Kasabian","Eez-eh", R.drawable.kasabian_album_cover));
        songs.add(new Song("Kasabian", "Fire", R.drawable.kasabian_album_cover));
        songs.add(new Song("Kasabian", "Underdog", R.drawable.kasabian_album_cover));
        songs.add(new Song("Kasabian", "Where Did All the Love Go?", R.drawable.kasabian_album_cover));
        songs.add(new Song("G-Eazy", " Me, Myself & I", R.drawable.g_eazy_album_cover));
        songs.add(new Song("G-Eazy", "I Mean It", R.drawable.g_eazy_album_cover));
        songs.add(new Song("G-Eazy", "Him & I (with Helsey)", R.drawable.g_eazy_album_cover));
        songs.add(new Song("G-Eazy", "Let's get lost", R.drawable.g_eazy_album_cover));
        songs.add(new Song("G-Eazy", "Some Kind of Drug", R.drawable.g_eazy_album_cover));
        songs.add(new Song("Diskopunk", "Antonio America",R.drawable.diskopunk_album_cover));
        songs.add(new Song("Diskopunk", "Fire", R.drawable.diskopunk_album_cover));
        songs.add(new Song("Grimes", "Kill V. Maim", R.drawable.grimes_album_cover));
        songs.add(new Song("The Subways", "Rock & Roll Queen", R.drawable.the_subways_album_cover));
        songs.add(new Song("The Subways", "Oh yeah", R.drawable.the_subways_album_cover));
        songs.add(new Song("The Subways", "We Don't Need Money to Have a Good Time", R.drawable.the_subways_album_cover));


        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorAccent);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
