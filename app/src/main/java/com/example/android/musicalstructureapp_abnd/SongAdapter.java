package com.example.android.musicalstructureapp_abnd;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private int mCoverResourceId;

    public SongAdapter(Activity context, ArrayList<Song> songs, int CoverResourceId){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
        mCoverResourceId = CoverResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_song, parent, false);
        }

        Song currentSong = getItem(position);

        // Find the TextView in the list_song.xml layout with ID - artist_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the current Artist from song object and set it on the TextView
        artistTextView.setText(currentSong.getSongArtist());

        // Find the TextView in the list_song.xml layout with ID - song_text_view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        //Get the current song and set it on the TextView
        songTextView.setText(currentSong.getSongTitle());

        ImageView iconImage = (ImageView) listItemView.findViewById(R.id.cover_image);
        if (currentSong.hasImage()) {
            iconImage.setImageResource(currentSong.getCoverResourceId());
            iconImage.setVisibility(View.VISIBLE);
        } else {
            iconImage.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
