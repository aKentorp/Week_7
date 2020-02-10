package com.example.gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    View view;
    TextView tw;
    int colorCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.colorPrimary);

        tw = (TextView)findViewById(R.id.textView2);
        tw.setText(getIntent().getStringExtra("send_string"));

    }

    public void colorButton(View view) {
        if (colorCount % 2 == 0) {
            this.view.setBackgroundResource(R.color.pink);
        }
        else{
            this.view.setBackgroundResource(R.color.colorPrimary);
        }
        colorCount++;

    }

}
