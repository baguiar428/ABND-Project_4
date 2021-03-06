package com.example.android.musicalstructureapp_abnd;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Kasabian",R.drawable.kasabian_album_cover));
        songs.add(new Song("G-Eazy", R.drawable.g_eazy_album_cover));
        songs.add(new Song("Diskopunk", R.drawable.diskopunk_album_cover));
        songs.add(new Song("Grimes", R.drawable.grimes_album_cover));
        songs.add(new Song("The Subways", R.drawable.the_subways_album_cover));

        final ArtistAdapter adapter = new ArtistAdapter(this, songs, R.color.colorAccent);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}