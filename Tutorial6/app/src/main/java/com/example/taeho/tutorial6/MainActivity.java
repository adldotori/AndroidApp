package com.example.taeho.tutorial6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.parsers.SAXParser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameText = (EditText) findViewById(R.id.nameText);
        Button nameButton = (Button) findViewById(R.id.nameButton);

        nameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                intent.putExtra("nameText",name);
                startActivity(intent);
            }
        });
    }
}
