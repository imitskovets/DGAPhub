package ivan.mitskovets.dormitory.system.dgaphub;

import android.content.Intent;
import android.os.Build;
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
import android.view.ViewTreeObserver;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class TroublePlaceChoicerActivity extends AppCompatActivity {

    int relativeLayout_Height = 0;
    int relativeLayout_Width = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trouble_place_choicer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_tro_pla_cho);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24dp);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.trouble_place_choicer_relativeLayout);
        //GridLayout gridLayout = (GridLayout) findViewById(R.id.trouble_place_choicer_gridLayout);

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

        toolbar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    relativeLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                relativeLayout_Height = relativeLayout.getHeight();
                int atomHeight = (int) ((relativeLayout_Height / 40) * 9);
                int atomWidth = atomHeight;
                Log.v("CatalogClient", "sv_height = " + String.valueOf(relativeLayout_Height));
                Log.v("CatalogClient", "sv_width = " + String.valueOf(relativeLayout_Width));
                ImageButton imageButton0 = (ImageButton) findViewById(R.id.imgButton0);
                ImageButton imageButton1 = (ImageButton) findViewById(R.id.imgButton1);
                ImageButton imageButton2 = (ImageButton) findViewById(R.id.imgButton2);
                ImageButton imageButton3 = (ImageButton) findViewById(R.id.imgButton3);
                ImageButton imageButton4 = (ImageButton) findViewById(R.id.imgButton4);
                ImageButton imageButton5 = (ImageButton) findViewById(R.id.imgButton5);
                ImageButton imageButton6 = (ImageButton) findViewById(R.id.imgButton6);
                ImageButton imageButton7 = (ImageButton) findViewById(R.id.imgButton7);

                imageButton0.getLayoutParams().height = atomHeight;
                imageButton0.getLayoutParams().width = atomWidth;
                imageButton1.getLayoutParams().height = atomHeight;
                imageButton1.getLayoutParams().width = atomWidth;
                imageButton2.getLayoutParams().height = atomHeight;
                imageButton2.getLayoutParams().width = atomWidth;
                imageButton3.getLayoutParams().height = atomHeight;
                imageButton3.getLayoutParams().width = atomWidth;
                imageButton4.getLayoutParams().height = atomHeight;
                imageButton4.getLayoutParams().width = atomWidth;
                imageButton5.getLayoutParams().height = atomHeight;
                imageButton5.getLayoutParams().width = atomWidth;
                imageButton6.getLayoutParams().height = atomHeight;
                imageButton6.getLayoutParams().width = atomWidth;
                imageButton7.getLayoutParams().height = atomHeight;
                imageButton7.getLayoutParams().width = atomWidth;


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
