package com.example.android.musicalstructureapp_abnd;

public class Song {
    //Song title and artist for Song class. Use m for private variables
    private String mSongArtist;

    private String mSongTitle;

    //Constructor
    public Song(String SongArtist, String SongTitle) {
        mSongArtist = SongArtist;
        mSongTitle = SongTitle;
    }

    //Get the Song Artist from Song.

    public String getSongArtist() {
        return mSongArtist;
    }

    //Get the Song Title from Song.

    public String getSongTitle() {
        return mSongTitle;
    }
}
