package com.example.android.musicalstructureapp_abnd;

public class Song  {
    //Song title and artist for Song class. Use m for private variables
    private String mSongArtist;

    private String mSongTitle;

    private int mCoverResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //Constructor for SongsActivity
    public Song(String SongArtist, String SongTitle, int coverResourceId) {
        mSongArtist = SongArtist;
        mSongTitle = SongTitle;
        mCoverResourceId = coverResourceId;
    }

    //Constructor for ArtistsActivity
    public Song(String SongArtist, int coverResourceId) {
        mSongArtist = SongArtist;
        mCoverResourceId = coverResourceId;
    }

    //Get the Song Artist from Song.
    public String getSongArtist() {
        return mSongArtist;
    }

    //Get the Song Title from Song.

    public String getSongTitle() {
        return mSongTitle;
    }

    //Get Cover Image ID
    public int getCoverResourceId() {
        return mCoverResourceId;
    }

    //Returns whether or not there is an image for the song
    public boolean hasImage() {
        return mCoverResourceId != NO_IMAGE_PROVIDED;
    }
}
