package com.example.recyclerview11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = new ArrayList<>();
        loadData();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new NameAdapter(names));
    }

    private void loadData() {
        names.add("Marco");
        names.add("Jacob");
        names.add("Philip");
        names.add("Trudi");
        names.add("Isamu");
        names.add("Ibrahim");
        names.add("Eric");
        names.add("Lambert");
        names.add("Bohdan");
        names.add("Petros");
        names.add("Tigran");
        names.add("Angelina");
        names.add("Davit");
        names.add("Andre");
    }
}