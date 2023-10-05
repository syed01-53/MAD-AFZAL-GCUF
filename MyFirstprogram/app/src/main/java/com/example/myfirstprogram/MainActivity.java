package com.example.myfirstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void my_function(View view) {
                        EditText name = findViewById(R.id.etName);


                    TextView output = findViewById(R.id.tvOutput);

                        String s = name.getText().toString();
                        output.setText( s );
    }
}