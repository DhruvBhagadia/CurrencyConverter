package com.example.dell_pc.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void ClickFunction(View view){
        EditText TextField1 = (EditText) findViewById(R.id.TextField1);
        Log.i("Test",TextField1.getText().toString());
        String s = TextField1.getText().toString();
        Double d = Double.valueOf(s).doubleValue();
        Double ans = d/64.86;
        Toast.makeText(this,"$" + ans , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
