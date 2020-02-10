package com.example.gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText textBox;
    String savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox =(EditText) findViewById(R.id.editText);
    }


    public void onSave(View v){

        savedText = textBox.getText().toString();

        Log.i("all", "saved:" + savedText);
        textBox.setText("");
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("send_string", savedText);
        startActivity(intent);

        Toast.makeText(this, "SAVED BITCH", Toast.LENGTH_LONG).show();

    }





}
