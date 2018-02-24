package com.example.arya.aryawirasandi_1202150077_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class Daftarmenu extends AppCompatActivity {

    RecyclerView recyclerView;
    Adaptermenu adaptermenu;
    List<menu> daftarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarmenu);
    }
}
