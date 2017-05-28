package jp.techacademy.katahara.daisuke.p_map;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "SF Wonder Comic Italic.ttf");

        Button button1 = (Button) findViewById(R.id.login_button);
        button1.setOnClickListener(this);
        button1.setTypeface(typeface);

        Button button2 = (Button) findViewById(R.id.upload_button);
        button2.setOnClickListener(this);
        button2.setTypeface(typeface);

        Button button3 = (Button) findViewById(R.id.photo_button);
        button3.setOnClickListener(this);
        button3.setTypeface(typeface);

        Button button4 = (Button) findViewById(R.id.album_button);
        button4.setOnClickListener(this);
        button4.setTypeface(typeface);

        Button button5 = (Button) findViewById(R.id.lang_button);
        button5.setOnClickListener(this);
        button5.setTypeface(typeface);


        TextView textView = new TextView(this);
        textView.setText("MAP Your Photos!");

        Typeface typeface = Typeface.createFromAsset(getAssets(), "PLOK.TTF");
        textView.setTypeface(typeface);
    }

    @Override
    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.login_button;
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.upload_button;
                break;
            case R.id.photo_button;
                break;
            case R.id.album_button;
                break;
            case R.id.lang_button;
                break;

        }
    }
}
