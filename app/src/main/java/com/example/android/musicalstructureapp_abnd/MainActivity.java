package com.example.android.musicalstructureapp_abnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the "songs" category
        TextView songs = (TextView) findViewById(R.id.songs);

        //Find the view that shows the "artists" category
        TextView artists = (TextView) findViewById(R.id.artists);

        //Find the view that shows the "random" category
        TextView random = (TextView) findViewById(R.id.random);

        //Find the view that shows the "search" category
        TextView search = (TextView) findViewById(R.id.search);

        //Dind the view that shows the "playing" category
        TextView playing = (TextView) findViewById(R.id.playing);

        //Set a click listener on the songs view
        songs.setOnClickListener(new View.OnClickListener() {
            //This code will be executed when the songs View is clicked on
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        //Set a click listener on the artists view
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        //Set a click listener on the random view
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randomIntent = new Intent(MainActivity.this, RandomActivity.class);
                startActivity(randomIntent);
            }
        });

        //Set a click listener on the search view
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        //Set a click listener on the playing view
        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
