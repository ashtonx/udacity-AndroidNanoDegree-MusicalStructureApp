package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        TextView titleText = (TextView) findViewById(R.id.activity_title);
        TextView contentText = (TextView) findViewById(R.id.activity_content);
        ImageView imageExample = (ImageView) findViewById(R.id.activity_example_image);

        titleText.setText(getString(R.string.activity_playlist_name));
        contentText.setText(getString(R.string.activity_playlist_content));
        imageExample.setImageResource(R.drawable.playlist);
    }
}
