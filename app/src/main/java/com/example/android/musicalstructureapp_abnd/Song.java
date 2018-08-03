package com.example.android.musicalstructureapp_abnd;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {
    //Song title and artist for Song class. Use m for private variables
    private String mSongArtist;

    private String mSongTitle;

    private int mCoverResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mArtistBioId;

    //Constructor for SongsActivity
    public Song(String SongArtist, String SongTitle, int coverResourceId) {
        mSongArtist = SongArtist;
        mSongTitle = SongTitle;
        mCoverResourceId = coverResourceId;
    }

    //Constructor for ArtistsActivity
    public Song(String SongArtist, int coverResourceId, int artistBioId) {
        mSongArtist = SongArtist;
        mCoverResourceId = coverResourceId;
        mArtistBioId = artistBioId;
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

    //Get the Artist Bio ID from Song.
    public  int getArtistBioId() {
        return mArtistBioId;}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mSongArtist);
        dest.writeString(this.mSongTitle);
        dest.writeInt(this.mCoverResourceId);
        dest.writeInt(this.mArtistBioId);
    }

    protected Song(Parcel in) {
        this.mSongArtist = in.readString();
        this.mSongTitle = in.readString();
        this.mCoverResourceId = in.readInt();
        this.mArtistBioId = in.readInt();
    }

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel source) {
            return new Song(source);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };
}
