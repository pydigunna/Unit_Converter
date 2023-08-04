package com.example.unitconverter11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView1, textView2, textView3, textView4;
    EditText editText;
    Button con_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.heading);
        textView2 = findViewById(R.id.meter);
        textView3 = findViewById(R.id.cm);
        textView4 = findViewById(R.id.answer);
        editText = findViewById(R.id.edtNo);
        con_btn = findViewById(R.id.btn);
        con_btn.setOnClickListener(this);


    }

    private void ConvertFromCmToMeter() {
        String inMeter = editText.getText().toString();
        double inMeter1 =Double.parseDouble(inMeter);
        Double cm = inMeter1*100;
        textView4.setText(""+cm);

    }

    @Override
    public void onClick(View view) {
        ConvertFromCmToMeter();
    }
}