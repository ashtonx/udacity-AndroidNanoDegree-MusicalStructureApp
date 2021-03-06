package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button albumButton = (Button) findViewById(R.id.button_album);
        Button artistButton = (Button) findViewById(R.id.button_artist);
        Button libraryButton = (Button) findViewById(R.id.button_library);
        Button navigationButton = (Button) findViewById(R.id.button_navigation);
        Button playerButton = (Button) findViewById(R.id.button_player);
        Button playlistButton = (Button) findViewById(R.id.button_playlist);

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, ArtistActivity.class);
                startActivity(intent);
            }
        });
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, LibraryActivity.class);
                startActivity(intent);
            }
        });
        navigationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, NavigationActivity.class);
                startActivity(intent);
            }
        });
        playerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
    }
}
