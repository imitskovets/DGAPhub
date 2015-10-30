package ivan.mitskovets.dormitory.system.dgaphub;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class WashroomChoicerActivity extends AppCompatActivity {

    public int grid_height;
    public int grid_width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washroom_choicer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_tro_pla_cho);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("CatalogClient", "button onBack from washroom");
                onBackPressed();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final GridLayout gridLayout = (GridLayout) findViewById(R.id.washroom_GridLayout);
        gridLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    gridLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    gridLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                grid_height = gridLayout.getHeight();
                grid_width = gridLayout.getWidth();
                // fix sizes
                int atomWidth = (int)( grid_width / 7 );
                int atomHeight = (int)( grid_width / 7 );
                Log.v("CatalogClient", "grid_height = " + String.valueOf(grid_height));
                Log.v("CatalogClient", "grid_width = " + String.valueOf(grid_width));
                ImageButton ibsizer_0x1 = (ImageButton) findViewById(R.id.sizer_0x1);
                ImageButton ibsizer_2x3 = (ImageButton) findViewById(R.id.sizer_2x3);
                ImageButton ibsizer_3x3 = (ImageButton) findViewById(R.id.sizer_3x3);
                ImageButton ibsizer_4x3 = (ImageButton) findViewById(R.id.sizer_4x3);
                ImageButton ibsizer_5x3 = (ImageButton) findViewById(R.id.sizer_5x3);
                ImageButton ibsizer_6x3 = (ImageButton) findViewById(R.id.sizer_6x3);
                ImageButton ibsizer_7x3 = (ImageButton) findViewById(R.id.sizer_7x3);
                ImageButton ibsizer_8x0 = (ImageButton) findViewById(R.id.sizer_8x0);
                ImageButton ibsizer_9x1 = (ImageButton) findViewById(R.id.sizer_9x1);
                ImageButton ibsizer_9x2 = (ImageButton) findViewById(R.id.sizer_9x2);
                ImageButton ibsizer_9x3 = (ImageButton) findViewById(R.id.sizer_9x3);
                ImageButton ibsizer_9x4 = (ImageButton) findViewById(R.id.sizer_9x4);
                ImageButton ibsizer_9x5 = (ImageButton) findViewById(R.id.sizer_9x5);
                ImageButton hanger_0 = (ImageButton) findViewById(R.id.hanger_0);
                ImageButton hanger_1 = (ImageButton) findViewById(R.id.hanger_1);
                ImageButton sill = (ImageButton) findViewById(R.id.sill);
                ImageButton tap_0 = (ImageButton) findViewById(R.id.tap_0);
                ImageButton tap_1 = (ImageButton) findViewById(R.id.tap_1);
                ImageButton tap_2 = (ImageButton) findViewById(R.id.tap_2);
                ImageButton tap_3 = (ImageButton) findViewById(R.id.tap_3);
                ImageButton tap_4 = (ImageButton) findViewById(R.id.tap_4);
                ImageButton tap_5 = (ImageButton) findViewById(R.id.tap_5);
                ImageButton sink_0 = (ImageButton) findViewById(R.id.sink_0);
                ImageButton sink_1 = (ImageButton) findViewById(R.id.sink_1);
                ImageButton sink_2 = (ImageButton) findViewById(R.id.sink_2);
                ImageButton sink_3 = (ImageButton) findViewById(R.id.sink_3);
                ImageButton sink_4 = (ImageButton) findViewById(R.id.sink_4);
                ImageButton sink_5 = (ImageButton) findViewById(R.id.sink_5);
                ImageButton trashcan = (ImageButton) findViewById(R.id.trashcan);

                hanger_0.getLayoutParams().height = atomHeight;
                hanger_0.getLayoutParams().width = atomWidth;
                sill.getLayoutParams().height = atomHeight;
                sill.getLayoutParams().width = atomWidth * 3;
                hanger_1.getLayoutParams().height = atomHeight;
                hanger_1.getLayoutParams().width = atomWidth;
                ibsizer_0x1.getLayoutParams().height = atomHeight;
                ibsizer_0x1.getLayoutParams().width = atomWidth;
                tap_0.getLayoutParams().height = atomHeight * 2;
                tap_0.getLayoutParams().width = atomWidth;
                sink_0.getLayoutParams().height = atomHeight * 2;
                sink_0.getLayoutParams().width = atomWidth * 2;
                ibsizer_2x3.getLayoutParams().height = atomHeight;
                ibsizer_2x3.getLayoutParams().width = atomWidth;
                sink_1.getLayoutParams().height = atomHeight * 2;
                sink_1.getLayoutParams().width = atomWidth * 2;
                tap_1.getLayoutParams().height = atomHeight * 2;
                tap_1.getLayoutParams().width = atomWidth;
                ibsizer_3x3.getLayoutParams().height = atomHeight;
                ibsizer_3x3.getLayoutParams().width = atomWidth;
                tap_2.getLayoutParams().height = atomHeight * 2;
                tap_2.getLayoutParams().width = atomWidth;
                sink_2.getLayoutParams().height = atomHeight * 2;
                sink_2.getLayoutParams().width = atomWidth * 2;
                ibsizer_4x3.getLayoutParams().height = atomHeight;
                ibsizer_4x3.getLayoutParams().width = atomWidth;
                sink_3.getLayoutParams().height = atomHeight * 2;
                sink_3.getLayoutParams().width = atomWidth * 2;
                tap_3.getLayoutParams().height = atomHeight * 2;
                tap_3.getLayoutParams().width = atomWidth;
                ibsizer_5x3.getLayoutParams().height = atomHeight;
                ibsizer_5x3.getLayoutParams().width = atomWidth;
                tap_4.getLayoutParams().height = atomHeight * 2;
                tap_4.getLayoutParams().width = atomWidth;
                sink_4.getLayoutParams().height = atomHeight * 2;
                sink_4.getLayoutParams().width = atomWidth * 2;
                ibsizer_6x3.getLayoutParams().height = atomHeight;
                ibsizer_6x3.getLayoutParams().width = atomWidth;
                sink_5.getLayoutParams().height = atomHeight * 2;
                sink_5.getLayoutParams().width = atomWidth * 2;
                tap_5.getLayoutParams().height = atomHeight * 2;
                tap_5.getLayoutParams().width = atomWidth;
                ibsizer_7x3.getLayoutParams().height = atomHeight;
                ibsizer_7x3.getLayoutParams().width = atomWidth;
                ibsizer_8x0.getLayoutParams().height = atomHeight;
                ibsizer_8x0.getLayoutParams().width = atomWidth;
                trashcan.getLayoutParams().height = atomHeight;
                trashcan.getLayoutParams().width = atomWidth * 2;
                ibsizer_9x1.getLayoutParams().height = atomHeight;
                ibsizer_9x1.getLayoutParams().width = atomWidth;
                ibsizer_9x2.getLayoutParams().height = atomHeight;
                ibsizer_9x2.getLayoutParams().width = atomWidth;
                ibsizer_9x3.getLayoutParams().height = atomHeight;
                ibsizer_9x3.getLayoutParams().width = atomWidth;
                ibsizer_9x4.getLayoutParams().height = atomHeight;
                ibsizer_9x4.getLayoutParams().width = atomWidth;
                ibsizer_9x5.getLayoutParams().height = atomHeight;
                ibsizer_9x5.getLayoutParams().width = atomWidth;
            }
        });
    }


    public void hanger_0_OnClick(View view) {
    }

    public void sill_OnClick(View view) {
    }

    public void hanger_1_OnClick(View view) {
    }

    public void tap_0_OnClick(View view) {
    }

    public void sink_0_OnClick(View view) {
    }

    public void sink_1_OnClick(View view) {
    }

    public void tap_1_OnClick(View view) {
    }

    public void tap_2_OnClick(View view) {
    }

    public void sink_2_OnClick(View view) {
    }

    public void sink_3_OnClick(View view) {
    }

    public void tap_3_OnClick(View view) {
    }

    public void tap_4_OnClick(View view) {
    }

    public void sink_4_OnClick(View view) {
    }

    public void sink_5_OnClick(View view) {
    }

    public void tap_5_OnClick(View view) {
    }

    public void trashcan_OnClick(View view) {
    }
}
