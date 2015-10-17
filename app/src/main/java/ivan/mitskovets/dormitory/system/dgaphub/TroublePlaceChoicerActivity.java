package ivan.mitskovets.dormitory.system.dgaphub;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class TroublePlaceChoicerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trouble_place_choicer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_tro_pla_cho);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("CatalogClient", "button onBack from trouble place choicer");
                onBackPressed();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Upload you own photo of trouble", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClickImageButton0(View view) {
        Log.v("CatalogClient", "imgButton 0 click from trouble place choicer");
        Intent intent = new Intent(TroublePlaceChoicerActivity.this, WashroomChoicerActivity.class);
        //intent.putExtra("extraBody","extraContent");
        startActivity(intent);
    }

    public void onClickImageButton1(View view) {
    }

    public void onClickImageButton2(View view) {
    }

    public void onClickImageButton3(View view) {
    }

    public void onClickImageButton4(View view) {
    }

    public void onClickImageButton5(View view) {
    }

    public void onClickImageButton6(View view) {
    }

    public void onClickImageButton7(View view) {
    }
}
