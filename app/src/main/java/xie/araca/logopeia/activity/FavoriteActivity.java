package xie.araca.logopeia.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import xie.araca.logopeia.R;
import xie.araca.logopeia.databinding.ActivityArtistBinding;
import xie.araca.logopeia.databinding.ActivityEventBinding;
import xie.araca.logopeia.databinding.ActivityExploreBinding;
import xie.araca.logopeia.databinding.ActivityFavoriteBinding;
import xie.araca.logopeia.databinding.ActivityMainBinding;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActivityFavoriteBinding bindingFavorite = DataBindingUtil.setContentView(this, R.layout.activity_favorite);
        startToolbarUnder();

    }

    public void startToolbarUnder(){
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.toolbarMain.btHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        ActivityEventBinding bindingEvent = DataBindingUtil.setContentView(this, R.layout.activity_event);
        bindingEvent.toolbarEvent.btEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EventActivity.class);
                startActivity(intent);
            }
        });
        ActivityFavoriteBinding bindingFavorite = DataBindingUtil.setContentView(this, R.layout.activity_favorite);
        bindingFavorite.toolbarFavorite.btFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FavoriteActivity.class);
                startActivity(intent);
            }
        });
        ActivityExploreBinding bindingExplore = DataBindingUtil.setContentView(this, R.layout.activity_explore);
        bindingExplore.toolbarExplore.btExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExploreActivity.class);
                startActivity(intent);
            }
        });
        ActivityArtistBinding bindingArtists = DataBindingUtil.setContentView(this, R.layout.activity_artist);
        bindingArtists.toolbarArtist.btArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArtistActivity.class);
                startActivity(intent);
            }
        });
    }

}
