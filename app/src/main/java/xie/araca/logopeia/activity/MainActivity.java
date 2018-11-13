package xie.araca.logopeia.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import xie.araca.logopeia.R;
import xie.araca.logopeia.config.ConfigFirebase;
import xie.araca.logopeia.databinding.ActivityArtistBinding;
import xie.araca.logopeia.databinding.ActivityEventBinding;
import xie.araca.logopeia.databinding.ActivityMainBinding;
import xie.araca.logopeia.databinding.ActivityExploreBinding;
import xie.araca.logopeia.databinding.ActivityFavoriteBinding;

import android.databinding.DataBindingUtil;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ToolbarUnderActivity implements View.OnClickListener{

    private DatabaseReference referenceFirebase;
    private ToolbarUnderActivity toolbarUnderActivity = new ToolbarUnderActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEventBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        referenceFirebase = ConfigFirebase.getFirebase();
        referenceFirebase.child("kawhiL").setValue(1000);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {


            case R.id.btHome:
                btHome();
            case R.id.btArtists:
                btArtists();
            case R.id.btEvents:
                btEvents();
            case R.id.btExplore:
                btExplore();
            case R.id.btFavorite:
                btFavorite();
            default:
                break;
        }

    }

}
