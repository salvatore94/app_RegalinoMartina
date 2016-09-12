package org.polito.salvatore.regalinopermartina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imm = (ImageView) findViewById(R.id.imageView1);
        imm.setVisibility(View.INVISIBLE);
    }

    public void alTocco (View v) {
        Animation animazione = AnimationUtils.loadAnimation(this, R.anim.scale);
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setVisibility(View.INVISIBLE);


        ImageView imm = (ImageView) findViewById(R.id.imageView1);
        imm.setVisibility(View.VISIBLE);
        imm.setAnimation(animazione);

    }
}
