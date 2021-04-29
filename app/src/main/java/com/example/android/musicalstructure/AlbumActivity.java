package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        TextView titleText = (TextView) findViewById(R.id.activity_title);
        TextView contentText = (TextView) findViewById(R.id.activity_content);
        ImageView imageExample = (ImageView) findViewById(R.id.activity_example_image);

        titleText.setText(getString(R.string.activity_album_name));
        contentText.setText(getString(R.string.activity_album_content));
        imageExample.setImageResource(R.drawable.album);
    }
}