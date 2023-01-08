package com.example.hellocontraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int hitung=0;
    private TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast(View view){
        Context context=getApplicationContext();
        Toast toast=Toast.makeText(context,(R.string.message), Toast.LENGTH_SHORT);
        toast.show();

    }
    public void zero(View view) {
        hitung = 0 ;
        Toast zero = Toast.makeText(this, "0", Toast.LENGTH_SHORT);
        if (tampil != null) {
            tampil.setText(Integer.toString(hitung));
        }
    }

    public void count(View view){
        tampil=(TextView)findViewById(R.id.show_count) ;
        hitung++;
        tampil.setText(Integer.toString(hitung));
    }
}
