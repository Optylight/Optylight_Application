package optylight.norlia.net;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageButton = (ImageButton) findViewById(R.id.my_image_button);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Chambre.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageButton myImageButton2;

        myImageButton2 = (ImageButton) findViewById(R.id.my_image_button2);

        myImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, salon.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageButton myImageButton3;

        myImageButton3 = (ImageButton) findViewById(R.id.my_image_button3);

        myImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, cuisine.class);
                startActivity(intentLoadNewActivity);
            }
        });
        ImageButton myImageButton4;

        myImageButton4 = (ImageButton) findViewById(R.id.imageButton8);

        myImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, entree.class);
                startActivity(intentLoadNewActivity);
            }
        });
        ImageButton myImageButton5;

        myImageButton5 = (ImageButton) findViewById(R.id.imageButton2);

        myImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, entree.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
